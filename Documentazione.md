## Introduzione

### Informazioni sul progetto

 - Docenti responsabili al controllo del lavoro: Luca Muggiasca e Geo Petrini
 - Allievo responsabile della realizzazione dell'intero progetto: Jure Grgic
 - Luogo e materia ove si svolge il progetto: Scuola d'arti e mestieri di Trevano, nella classe I3AC, durante il modulo 306
 - Inizio del progetto: venerdì 6 Settembre 2019
 - Scadenza del progetto: venerdì 20 Dicembre 2019
 - Nome del progetto assegnato: Fiocchi di neve
      
### Abstract

  E’ una breve e accurata rappresentazione dei contenuti di un documento,
  senza notazioni critiche o valutazioni. Lo scopo di un abstract efficace
  dovrebbe essere quello di far conoscere all’utente il contenuto di base
  di un documento e metterlo nella condizione di decidere se risponde ai
  suoi interessi e se è opportuno il ricorso al documento originale.

  Può contenere alcuni o tutti gli elementi seguenti:

  -   **Background/Situazione iniziale**

  -   **Descrizione del problema e motivazione**: Che problema ho cercato
      di risolvere? Questa sezione dovrebbe includere l'importanza del
      vostro lavoro, la difficoltà dell'area e l'effetto che potrebbe
      avere se portato a termine con successo.

  -   **Approccio/Metodi**: Come ho ottenuto dei progressi? Come ho
      risolto il problema (tecniche…)? Quale è stata l’entità del mio
      lavoro? Che fattori importanti controllo, ignoro o misuro?

  -   **Risultati**: Quale è la risposta? Quali sono i risultati? Quanto è
      più veloce, più sicuro, più economico o in qualche altro aspetto
      migliore di altri prodotti/soluzioni?

  Esempio di abstract:

  > *As the size and complexity of today’s most modern computer chips
  > increase, new techniques must be developed to effectively design and
  > create Very Large Scale Integration chips quickly. For this project, a
  > new type of hardware compiler is created. This hardware compiler will
  > read a C++ program, and physically design a suitable microprocessor
  > intended for running that specific program. With this new and powerful
  > compiler, it is possible to design anything from a small adder, to a
  > microprocessor with millions of transistors. Designing new computer
  > chips, such as the Pentium 4, can require dozens of engineers and
  > months of time. With the help of this compiler, a single person could
  > design such a large-scale microprocessor in just weeks.*      
      
### Scopo

  Lo scopo del progetto è apprendere le conoscenze tecniche per portare avanti un progetto individualmente

## Analisi

### Analisi del dominio
  
  - Il programma viene svolto con java o javascript
  - Verrà esposto un triangolo bianco in una schermata e bisognerà cliccare in vari punti della schermata per poter "tagliare" il           triangolo in vari modi
  - Gli utenti che interagiscono con il programma non hanno bisogno di alcuna conoscenza tecnica
  - Bisogna avere una buona conoscenza di java, o javascript nel caso si utilizzi questo linguaggio per fare il programma

   -   Quale è e come è organizzato il contesto in cui il prodotto dovrà
       funzionare?

  -   Come viene risolto attualmente il problema? Esiste già un prodotto
      simile?

  -   Chi sono gli utenti? Che bisogni hanno? Come e dove lavorano?

  -   Che competenze/conoscenze/cultura posseggono gli utenti in relazione
      con il problema?

  -   Esistono convenzioni/standard applicati nel dominio?

  -   Che conoscenze teoriche bisogna avere/acquisire per poter operare
      efficacemente nel dominio?

  -   …
  
### Analisi e specifica dei requisiti

  1.  Il programma deve poter presentare un interfaccia grafica all'utente per permettergli di interagire con il programma
  2.  La schermata deve presentare un triangolo
  3.  L'utente deve avere la possibilità di "tagliare" il triangolo a proprio piacimento
  4. I tagli del triangolo devono essere fatti con il mouse
  5.  I colori utilizzati per lo sfondo della schermata e per il triangolo, devono essere differenti
  6.  Quando l'utente schiaccia all'interno della schermata, deve apparire un puntino distinguibile nello stesso punto in cui viene             eseguita l'azione
  7.  L'utente deve avere la possibilità di spostare o eliminare a proprio piacimento i puntini che ha già piazzato in precedenza
  8.  Devono essere disponibili in schermata due pulsanti, sempre disinguibili, per permettere di resettare i "tagli" oppure salvarli
  9.  Una volta salvato il sistema di taglio, deve apparire la schermata con il relativo triangolo tagliato e stampato per 8 volte in
      modo da formare una forma ottagonale, così da sembrare un fiocco di neve
  10.  L'applicativo deve permettere di salvare i punti di taglio per permettere modifiche o rigenerazioni future
  11. L'applicativo deve salvare la figura del fiocco di neve generato in formato raster e vettoriale, preferibilmente in formati PNG e       SVG (la dimenosione dell'immmagine è scelta libera dell'utente)
  12. L'applicativo deve essere scritto in java o javascript
  13. Se JAVA: deve esistere un sito con descrizione software e deve essere possibile scaricare il software
  14. Se JAVASCRIPT: Deve esserci un sito web che ospiti l'applicativo

 Una volta eseguito il programma

  In base alla lista dei requisiti e all’analisi degli stessi, il
  progettista redige una *specifica dei requisiti* in cui elenca e
  descrive in modo dettagliato quali sono le funzionalità che il prodotto
  fornirà. La specifica dovrebbe essere abbastanza dettagliata da poter
  essere utilizzata come base per lo sviluppo, ma non troppo; ad esempio
  non dovrebbe contenere dettagli di implementazione, o definizioni
  dettagliate dell’interfaccia grafica a meno che questi non siano
  considerati cruciali. Non si deve scordare che i requisiti non
  rappresentano delle attività bensì delle caratteristiche che il prodotto
  dovrà possedere.




  |**ID**	|**Nome**			|**Priorità**|**Vers**|**Note**  |
  |----|------------|--------|----|------|
  |Req-12|Dovrà esserci una maschera di login|1|1.0|...|
  |Req-13|Si dovranno poter immettere nuovi allievi|1|1.0|...|
  |Req-14|Dovrà essere possibile la ricerca di allievi|1|1.0|...|
  
  



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

Sulla documentazione apparirà solamente l’ultima versione, mentre le
vecchie dovranno essere inserite nei diari.

**Note**: eventuali osservazioni importanti o riferimenti ad altri
requisiti.

**Sotto requisiti**: elementi che compongono il requisito.
#Domande
 - Salvataggio dimensioni definite: solo raster o anche vettoriale?
 - Salvataggio dimensioni minime e massime?
 - In che tipo di file vanno salvati i punti di taglio?
 - I punti salvati dovranno poter essere caricati, come?
 - Quanti poligoni di taglio si possono avere?
 - Esiste un numero limite di punti?
 - Che caratteristiche deve avere il sito?
 - Cosa significa la generazione in tempo reale?
 - Il tasto genera, salva subito o visualizza un anteprima?
 - Nella versione Java, come deve essere forntio il file? .class o .jar?
 - Il triangolo può variare di dimensioni?
 - Il triangolo deve essere sempre centrato?
 - Deve esistere una barra di menu in alto?
 - Prima del salvataggio definizione di cartella?
 - Deve esistere un file di configurazione?
 - Proprietà del sito nel progetto?
 - Finestra ridimensionabile? Dimensioni minime?
 - Colori del sito?
 - Nel sito JAVA cosa deve esserci esattamente?
 - Rendering live, opzione o deve essere abilitato da subito?
 - Salvataggio percorso: file o db?
 - Sistema di caricamento, come deve essere fatta?
