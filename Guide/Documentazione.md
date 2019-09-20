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

  Lo scopo del progetto è apprendere le conoscenze tecniche per portare avanti un progetto individualmente.

## Analisi

### Analisi del dominio
  
  La scuola d'arti e mestieri di Trevano è l'ambiente di lavoro dove verrà svolto il progetto. Il programma deve essere svolto con il     linguaggio java o javascript. È stato utilizzato un mac con un virtual machine per poter sviluppare l'applicativo.
  Non c'è stata alcuna informazioni riguardo altri programmatori che hanno sviluppato questo programma, ma probabilmente vista la bassa   difficoltà del programma, altri programmatori avranno già provato a creare un codice simile. L'utente che andrà ad utilizzare il         seguente applicativo non necessità di nessuna specifica tecnica avanzata, necessiterà magari di una piccola guida che aiuti l'utente     ad orientarsi. A differenza dell'utente, il programmatore che deve sviluppare il programma, è obbligato a conoscere delle determinate   nozioni di java o javascript per poter fare il proprio lavoro. Come ogni progetto, si hanno dei requisiti da rispettare per poter       svolgere un buon lavoro, e questi requisiti variano a seconda di cosa vuole il cliente.

  
### Analisi e specifica dei requisiti

  |**ID**	|**Nome**			|**Priorità**|**Vers**|**Note**  |
  |----|------------|--------|----|------|
  |Req-1 |Il software deve essere scritto in JAVA|livello 1|1.0|-|
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
