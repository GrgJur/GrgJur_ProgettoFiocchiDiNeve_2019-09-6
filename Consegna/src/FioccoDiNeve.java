

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 * @version 27.09.19
 * @author Jure Grgic
 */
public class FioccoDiNeve extends JPanel implements MouseListener, MouseMotionListener{

    /**
     * Lista contenente le percentuali delle posizioni dei puntini in base alla 
     * dimensione dello schermo.
     */
    private List<PuntoDouble> percentages = new ArrayList<>();
    /**
     * Lista contenente le liste di PuntiDouble, ovvero, dopo ogni poligono creato,
     * tutti i suoi punti vengono salvati in una lista e a sua volta la lista
     * viene salvata in questa lista di liste.
     */
    private List<List<PuntoDouble>> listeDiPunti = new ArrayList<>();
    /**
     * Lista contenente tutti i poligoni di ritaglio creati.
     */
    private List<Polygon> polygons = new ArrayList<>();
    /**
     * Rappresenta il poligono che deve essere ritagliato, che andrà poi a creare
     * il fiocco di neve. Nessun valore di default.
     */
    private Polygon poligonoBase = new Polygon();
    /**
     * Contiene le percentuali delle posizioni dei puntini che formano il 
     * triangolo di base.
     */
    private double pointsOfPolygon[] = {0.335, 0.65, 0.65, 0.1, 0.1, 0.9};
    /**
     * Raggio dei puntini. Valore di default: 4.
     */
    public int R = 10;
    /**
     * Definisce l'area dove si possono disegnare i poligoni di taglio.
     * Valore di default: 50
     */
    public int BORDO = 30;
    /**
     * Punto dove è stato premuto l'ultima volta il mouse.
     * Nessun valore di default.
     */
    private Point lastPoint = null;
    /**
     * Larghezza del frame. Nessun valore di default.
     */
    private int larghezzaSchermo;
    /**
     * Altezza del frame. Nessun valore di default.
     */
    private int altezzaSchermo;

    /**
     * Controlla se il poligono è stato completato.
     */
    private boolean createdPolygon = false;

    /**
     * È il punto con cui si vuole interagire.Nessun valore di default.
     */
    private PuntoDouble interactWithPoint = null;
    
    /**
     * Indice del punti con cui si interagisce. Nessun valore di default.
     */
    private int index;
    /**
     * Indica l'ultimo punto che è stato cliccato convertito in percentuale.
     */
    private PuntoDouble punto;
    /**
     * Indica se il fiocco di neve è attualmente stato generato o no.
     */
    private boolean generated = false;
    
    /**
     * Metodo costruttore.
     */
    public FioccoDiNeve(){
        
        this.addMouseListener(this);
        this.addMouseMotionListener(this); 
        
    }
    
    /**
     * Invocato quando il mouse schiaccia e rilascia il pulsante.
     * @param e l'evento da elaborare.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        
        // Controlla se si clicca il mouse all'interno dell'area apposita.
        if(e.getButton() == MouseEvent.BUTTON3 && clickedArea(e.getPoint())){
            lastPoint = new Point(e.getPoint());
            
            // Controlla se completa un poligono.
            if(percentages.size() < 3){
                
                punto = new PuntoDouble(lastPoint.x / (double) larghezzaSchermo,
                                        lastPoint.y / (double) altezzaSchermo);
                percentages.add(new PuntoDouble(punto.x, punto.y));
                
            }else{
                if(!closedPolygon(lastPoint)){
                    
                    punto = new PuntoDouble(lastPoint.x / (double) larghezzaSchermo,
                                            lastPoint.y / (double) altezzaSchermo);
                    percentages.add(new PuntoDouble(punto.x, punto.y));
                    
                }else{
                    
                    createdPolygon = true;
                    
                }
            }
            this.repaint();
        }
        
        if(e.getButton() == MouseEvent.BUTTON1 && isOver(e.getPoint())){
            
            percentages.remove(interactWithPoint);
            this.repaint();
            
        }
        
    }
    
    /**
     * Invocato quando il mouse schiaccia il pulsante.
     * @param e l'evento da elaborare
     */
    @Override
    public void mousePressed(MouseEvent e) {}

    /**
     * Invocato quando il mouse rilascia il pulsante.
     * @param e l'evento da elaborare
     */
    @Override
    public void mouseReleased(MouseEvent e) {}

    /**
     * Invocato quando il mouse entra nel frame.
     * @param e l'evento da elaborare
     */
    @Override
    public void mouseEntered(MouseEvent e) {}

    /**
     * Invocato quando il mouse esce dal frame.
     * @param e l'evento da elaborare
     */
    @Override
    public void mouseExited(MouseEvent e) {}
    
    @Override
    public void mouseDragged(MouseEvent e) {
        
        if(isOver(e.getPoint()) && MouseEvent.BUTTON2 == e.getButton()){
            
            lastPoint = e.getPoint();
            punto = new PuntoDouble(lastPoint.x / (double) larghezzaSchermo,
                                    lastPoint.y / (double) altezzaSchermo);
            percentages.set(index, punto);
            this.repaint();
            
        }
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {}
    
    /**
     * Genera il fiocco di neve.
     */
    public void generateSnowFlake(){
        
        generated = !generated;
        this.repaint();
        
    }
    
    /**
     * Controlla se il mouse ha cliccato all'internp dell'area acconsentita 
     * dove poter creare i poligoni di ritaglio.
     * @param p è la coordinata dove è stato premuto il mouse.
     * @return vero o falso.
     */
    public boolean clickedArea(Point p){
        
        return (p.x > BORDO && p.y > BORDO &&
                p.x < larghezzaSchermo - BORDO && p.y < altezzaSchermo - BORDO);
        
    }
    
    /**
     * Controlla se il mouse sta premendo effettivamente un puntino.
     * @param p coordinata dove ha cliccato il mouse.
     * @return vero o false.
     */
    public boolean isOver(Point p){
        
        boolean control = false;
        int over;
        for(int i = 0; i < percentages.size(); i++){
            
            over = (int)Math.pow((int)((percentages.get(i).x*larghezzaSchermo) - p.x), 2)
                 + (int)Math.pow((int)((percentages.get(i).y*altezzaSchermo) - p.y), 2);
            if(over < R*R){
                control = true;
                interactWithPoint = percentages.get(i);
                index = i;
                i = percentages.size();
            }
        }
        return control;
    }
    
    /**
     * Controlla se il mouse schiaccia il punto d'origine del poligono
     * di ritaglio che si vuole creare.
     * @param p coordinata dove ha cliccato il mouse.
     * @return vero o false.
     */
    public boolean closedPolygon(Point p){
        
        boolean b = false;
        int over = (int)Math.pow((int)(percentages.get(0).x*larghezzaSchermo - p.x), 2)
                 + (int)Math.pow((int)(percentages.get(0).y*altezzaSchermo - p.y), 2);
        
        if(over < R*R){
            b = true;
        }
        return b;
        
    }
    
    /**
     * Metodo che resetta la lista dei punti dell'ultimo poligono di ritaglio creato.
     */
    public void resetLists(){
        percentages.clear();
        listeDiPunti.clear();
        generated = false;
        this.repaint();
    }
    
    /**
     * Metodo che serve per salvare in formato png il fiocco di neve generato.
     */
    public void saveImage(){
        
        BufferedImage bi = new BufferedImage(1024, 768, BufferedImage.TYPE_INT_RGB);

        paint(bi.getGraphics());

        try {
            JFileChooser jfc = new JFileChooser();
            int returnvalue = jfc.showOpenDialog(null);
            if(returnvalue == JFileChooser.APPROVE_OPTION){
                File selectedFile = jfc.getSelectedFile();
                ImageIO.write(bi, "png", selectedFile);
            }
        } catch (IOException ex) {}
        
    }
    
    /**
     * Ritorna il valore dell'attributo generated.
     * @return true o false a dipendenza del valore di generated.
     */
    public boolean isGenerated() {
        return generated;
    }
    
    /**
     * Metodo che permette di disegnare nel frame.
     * @param g il contesto grafico in cui dipingere.
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        // Setta le dimensioni della finestra.
        larghezzaSchermo = this.getWidth();
        altezzaSchermo = this.getHeight();
        
        poligonoBase = new Polygon();
                
        g.setColor(Color.pink);
        g.fillRect(0, 0, larghezzaSchermo, altezzaSchermo);
        
        // delimitata un area dove si possono disegnare i poligoni di ritaglio.
        g.setColor(Color.black);
        g.fillRect(BORDO, BORDO, larghezzaSchermo - BORDO * 2, altezzaSchermo - BORDO * 2);

        
        //DISEGNO BASE INIZIALE (INIZIO)
        
        // Array per istanziare le coordinate dei punti del poligono.
        int[] puntiPoligonoX = new int[3];
        int[] puntiPoligonoY = new int[3];

        puntiPoligonoX[0] = (int) (pointsOfPolygon[0] * larghezzaSchermo);
        puntiPoligonoX[1] = (int) (pointsOfPolygon[1] * larghezzaSchermo);
        puntiPoligonoX[2] = (int) (pointsOfPolygon[2] * larghezzaSchermo);

        puntiPoligonoY[0] = (int) (pointsOfPolygon[3] * altezzaSchermo);
        puntiPoligonoY[1] = (int) (pointsOfPolygon[4] * altezzaSchermo);
        puntiPoligonoY[2] = (int) (pointsOfPolygon[5] * altezzaSchermo);

        
        for (int i = 0; i < 3; i++) {
            poligonoBase.addPoint(puntiPoligonoX[i], puntiPoligonoY[i]);
        }
        
        //DISEGNO BASE INIZIALE (FINE)
        
        double xOrigine;
        double yOrigine;
        int i = 0;
        boolean controllo = true;

        PuntoDouble pd = null;
        PuntoDouble primo = null;

        g.setColor(Color.black);
        for (List<PuntoDouble> percentuali : listeDiPunti) {

            Polygon poligonoCreato = new Polygon();
            for (PuntoDouble p : percentuali) {

                poligonoCreato.addPoint((int) (p.x * larghezzaSchermo), (int) (p.y * altezzaSchermo));

                polygons.add(poligonoCreato);

            }

        }
        
        if(!generated){
            
            // Disegna il poligono base.
            g.setColor(Color.white);
            g.fillPolygon(puntiPoligonoX, puntiPoligonoY, 3);
           
            //Disegna i poligoni già creati.
            g.setColor(Color.black);
            for(Polygon p : polygons){

                g.fillPolygon(p);

            }
            
            polygons.clear();

            i = 0;
            controllo = false;
            for(PuntoDouble p : percentages){

                if(percentages.get(0) == p) g.setColor(Color.green);
                else g.setColor(Color.red);

                xOrigine = p.x * larghezzaSchermo;
                yOrigine = p.y * altezzaSchermo;
                g.fillOval((int)xOrigine - R, (int)yOrigine - R, R * 2, R * 2);

                if(i > 0){

                    g.setColor(Color.gray);
                    g.drawLine( (int)(percentages.get(i-1).x * larghezzaSchermo),
                                (int)(percentages.get(i-1).y * altezzaSchermo),
                                (int)(percentages.get(i).x * larghezzaSchermo),
                                (int)(percentages.get(i).y * altezzaSchermo));

                    if (createdPolygon && i + 1 == percentages.size()) {
                        g.drawLine( (int)(percentages.get(i).x * larghezzaSchermo),
                                    (int)(percentages.get(i).y * altezzaSchermo),
                                    (int)(percentages.get(0).x * larghezzaSchermo),
                                    (int)(percentages.get(0).y * altezzaSchermo));
                        createdPolygon = false;
                        listeDiPunti.add(List.copyOf(percentages));
                        controllo = true;
                    }

                }
                i++;

            } 

            if(controllo){
                controllo = false;
                percentages.clear();
                this.repaint();
            }
        
        }else{
            
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setColor(Color.gray);
            
            Area area1 = new Area(poligonoBase);
            
            for(Polygon p : polygons){
                
                Area area2 = new Area(p);
                area1.subtract(area2);
                
            }

            
            AffineTransform toRight = new AffineTransform(new double[] {-1.0,0.0,0.0,1.0});
            AffineTransform toDown = new AffineTransform(new double[] {1.0,0.0,0.0,-1.0});
            
            
            g2.setColor(Color.white);
            g2.scale(0.5, 0.5);
            g2.translate(400, 70);  
            g2.fill(area1);
            
            g2.transform(toRight);
            g2.translate(-1330, 0); 
            g2.fill(area1);
            
            g2.transform(toDown);
            g2.translate(0, -1250); 
            g2.fill(area1);
            
            g2.transform(toRight);
            g2.translate(-1330, 0); 
            g2.fill(area1);
            
            g2.rotate(Math.toRadians(-120), larghezzaSchermo/2, altezzaSchermo/2);
            g2.translate(-470, -284);
            g2.fill(area1);
            
            g2.rotate(Math.toRadians(-180), larghezzaSchermo/2, altezzaSchermo/2);
            g2.translate(-305, -554);
            g2.fill(area1);
            
            g2.translate(305, 554);
            g2.rotate(Math.toRadians(180), larghezzaSchermo/2, altezzaSchermo/2);
            
            g2.transform(toDown);
            g2.translate(0, -1250);
            g2.fill(area1);
            
            g2.translate(0, 1250);
            g2.translate(304, -696);
            g2.rotate(Math.toRadians(-180), larghezzaSchermo/2, altezzaSchermo/2);
            g2.fill(area1);
            
            g2.rotate(Math.toRadians(-60), larghezzaSchermo/2, altezzaSchermo/2);
            g2.translate(-318, -8);
            g2.fill(area1);
            
            g2.transform(toRight);
            g2.translate(-1331, 0);
            g2.fill(area1);
            
            g2.transform(toDown);
            g2.translate(0, -1250);
            g2.fill(area1);
            
            g2.transform(toRight);
            g2.translate(-1330, 0);
            g2.fill(area1);
        
            
            polygons.clear();
            
            
        }
        
    }
            
}