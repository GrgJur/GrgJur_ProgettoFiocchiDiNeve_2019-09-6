## Introduzione

### Informazioni sul progetto

 - Docenti responsabili al controllo del lavoro: Luca Muggiasca e Geo Petrini
 - Allievo responsabile della realizzazione dell'intero progetto: Jure Grgic
 - Luogo e materia ove si svolge il progetto: Scuola d'arti e mestieri di Trevano, nella classe I3AC, durante il modulo 306
 - Inizio del progetto: venerdì 6 Settembre 2019
 - Scadenza del progetto: venerdì 20 Dicembre 2019
 - Nome del progetto assegnato: Fiocchi di neve
      
### Abstract

  È stato creato un applicativo denominato "Fiocco di neve" che, quando viene eseguito, il programma presenta un frame dove è possibile       fare dei tagli ad un triangolo, in modo da poter creare e mostrare un fiocco di neve utilizzando il triangolo appena tagliato.
  In seguito è viene converitita una copia del fiocco generato, in un formato PNG o SVG.
  Infine viene inserito in un sito appositamente creato per questo, tutti i requisiti prestabiliti, con il link per installare il file     .jar dell'applicativo "Fiocco di neve" ed infine una serie di screenshot che hanno il ruolo di una mini guida per poter informare gli   utenti su come utilizzare il programma.
  L'applicativo è stato sviluppato con il linguaggio di java o javascript.

### Scopo

  Lo scopo del progetto è apprendere le conoscenze tecniche per portare avanti un progetto individualmente. Oltretutto serve per poterci   ambientare già nel mondo del lavoro e per far si che in caso di difficoltà, proviamo a trovare una soluzione da soli.

## Analisi

### Analisi del dominio
  
  La scuola d'arti e mestieri di Trevano è l'ambiente di lavoro dove verrà svolto il progetto. Il programma deve essere svolto con il     linguaggio java o javascript. È stato utilizzato un mac con un virtual machine per poter sviluppare l'applicativo.
  Non c'è stata alcuna informazioni riguardo altri programmatori che hanno sviluppato questo programma, ma probabilmente vista la bassa   difficoltà del programma, altri programmatori avranno già provato a creare un codice simile. L'utente che andrà ad utilizzare il         seguente applicativo non necessità di nessuna specifica tecnica avanzata, necessiterà magari di una piccola guida che aiuti l'utente     ad orientarsi. A differenza dell'utente, il programmatore che deve sviluppare il programma, è obbligato a conoscere delle determinate   nozioni di java o javascript per poter fare il proprio lavoro. Come ogni progetto, si hanno dei requisiti da rispettare per poter       svolgere un buon lavoro, e questi requisiti variano a seconda di cosa vuole il cliente.

  
### Analisi e specifica dei requisiti

  |**ID**	|**Nome**			|**Priorità**|**Vers**|**Note**  |
  |----|------------|--------|----|------|
  |Req-1|Il software deve essere scritto in JAVA|livello 1|1.0|-|
  |Req-2|Deve esistere sito con descrizione software|livello 1|1.0|-|
  |Req-3|Deve essere possibile scaricare il software|livello 1|1.0|-|
  |Req-4|I tagli del triangolo devono poter essere fatti con il mouse|livello 1|1.0|-|
  |Req-5|Deve esserci un'interfaccia grafica|livello 1|1.0|-|
  |Req-6|L'area di lavoro deve essere un triangolo|livello 1|1.0|-|
  |Req-7|Deve essere possibile resettare i punti registrati|livello 1|1.0|-|
  |Req-8|Deve esistere il tasto genera fiocco|livello 1|1.0|-|
  |Req-9|La generazione deve avvenire in tempo reale|livello 2|1.0|-|
  |Req-10|I punti devono poter essere spostati o rimossi|livello 2|1.0|-|
  |Req-11|Il lavoro deve poter essere salvato|livello 1|1.0|-|
  |Req-12|Il salvataggio deve essere fatto in formato PNG o SVG|livello 1|1.0|-|
  |Req-13|Il salvataggio deve avere dimensioni definite dall'utente|livello 1|1.0|-|
  |Req-14|Deve essere possibile salvare i punti di taglio|livello 1|1.0|-|

**Spiegazione elementi tabella dei requisiti:**

**ID**: identificativo univoco del requisito

**Nome**: breve descrizione del requisito

**Priorità**: indica l’importanza di un requisito nell’insieme del
progetto, definita assieme al committente. Ad esempio poter disporre di
report con colonne di colori diversi ha priorità minore rispetto al
fatto di avere un database con gli elementi al suo interno. Solitamente
si definiscono al massimo di 2-3 livelli di priorità.

**Versione**: indica la versione del requisito. Ogni modifica del
requisito avrà una versione aggiornata.

**Note**: eventuali osservazioni importanti o riferimenti ad altri
requisiti.

**Sotto requisiti**: elementi che compongono il requisito.3

### Use case

utente -> Apertura dell'applicativo  
utente -> Caricamento -> Triangolo visibile -> Interazione con l'applicativo  
utente -> Fine ritaglio -> Conferma forma -> Visualizzazione risultato -> Salvataggio immagine  
utente -> Fine o riavvio dell'applicativo  

### Pianificazione

 La pianificazione del progetto è stata fatta con un diagramma di Gantt.
 Ecco in ordine gli incarichi da svolgere:
  - Analisi
    - Analisi dei requisiti per l'applicativo da sviluppare
    - Formulazione di domande al cliente per possibili fraintendimenti dei requisiti
  - Preparazione dell'ambiente di lavoro
    - Creazione del Gantt
    - Creazione di una repository dove tenere tutti i file
    - Sistemazione delle cartelle e dei file all'interno della repository
    - Creazione di una macchina virtuale
    - Installazione di Github Desktop nella macchina virtuale
    - Configurazione di Github Desktop con Github di rete
  - Sviluppo dell'applicativo
    - Creazione del JPanel
    - Creazione dell'interfaccia grafica
    - Gestione dei puntini
    - Gestione triangolo tagliato
    - Gestione formato del fiocco
    - Test dell'applicativo (svolto in contemporanea con lo sviluppo dell'applicativo)
  - Integrazione
    - Creazione del sito
    - Integrazione di tutti i file sul sito

 Infine gli ultimi due incarichi sono la documentazione e i diari, questi due incarichi a differenza degli altri, iniziano e finiscono     in contemporanea con il progetto in generale, siccome essi vengono appunto aggiornati ogni volta che il progetto è stato modificato o   ampliato, rimanendo attivi per tutta la durata del progetto.


### Analisi dei mezzi

Il progetto è stato svolto con la versione 10.12.5 del macOS Sierra, appartenente all'aula 422, della scuola d'arti e mestieri di Trevano e con la versione 10.13.6 del macOS High Sierra, il mio computer personale. Per salvare i file è stato utilizzato come "magazzino" Github e Github Desktop. Per sviluppare il programma invece è stato utilizzato l'editor NetBeans versione 11.1. Il Gantt è stato creato grazie alla versione 1.9.1 di ProjectLibre. 

## Progettazione

### Design dell’architettura del sistema
Il tutto parte dalla classe FioccoDiNeve.java, questa classe utilizza FioccoDiNeveFrame.java come interfaccia grafica, dove appunto verrà disegnato il fiocco di neve.
La classe FioccoDiNeve.java estende il JPanel, che permette appunto di passare a FioccoDiNeveFrame.java, grazie al metodo paintComponent; inoltre implementa MouseListener e MouseMotionListener, necessari per poter interagire con l'applicazione.
I metodi di MouseListener e MouseMotionListener che vengono utilizzati sono mouseClicked e mouseDragged.
Sono presenti tre liste per il salvataggio dei punti/poligoni di ritaglio: 
 - la lista "percentages" che si occupa di salvare la posizione in percentuale dei puntini dell'attuale poligono che si sta creando, ciò viene permesso grazie ad una classe esterna: PuntoDouble.java
 - la lista "listeDiPunti" che contiene tutte le liste percentages create (che formano appunto un poligono di ritaglio)
 - la lista "polygons", dove vengono presi tutti i punti creati e uniti per formare i vari poligoni, per poi salvare qui dentro
Oltretutto sono presenti altri 5 metodi:
 - Il metodo "generateSnowFlake", è un semplice metodo per la generazione del fiocco di neve
 - Il metodo "clickedArea", anch'esso è un semplice metodo che controlla se il mouse clicca all'interno dell'area determinata (area blu)
 - Il metodo "isOver" che controlla se il mouse ha cliccato un determinato puntino creato in precedenza
 - Il metodo "closedPolygon" che controlla se il mouse ha cliccato il puntino di origine di un poligono di ritaglio
 - Infine il metodo "resetLists", resetta tutte le liste, ovvero "percentages", "listeDiPunti" e "polygons"

### Design dei dati e database



### Schema E-R, schema logico e descrizione.



### Design delle interfacce



### Design procedurale



## Implementazione


## Test

### Protocollo di test



### Risultati test


### Mancanze/limitazioni conosciute


## Consuntivo



## Conclusioni


### Sviluppi futuri
  
  
  
### Considerazioni personali


### Sitografia


## Allegati

