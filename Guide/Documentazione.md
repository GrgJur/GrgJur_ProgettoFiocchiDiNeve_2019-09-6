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

-----------------------------------------------------------
-----------------------------------------------------------
### Use case

| utente | Apertura dell'applicativo | 
| utente | caricamento | Triangolo visibile |

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

 Infine gli ultimi due incarichi sono la documentazione e i diari, questi due incarichi a differenza degli altri, iniziano e finiscono     in contemporanea con il progetto in generale, siccome essi vengono aggiornati ogni volta che il progetto è stato modificato o ampliato


### Analisi dei mezzi

Il progetto è stato svolto unicamente con la versione 10.12.5 del macOS Sierra, appartenente all'aula 422, della scuola d'arti e mestieri di Trevano. Per salvare i file è stato utilizzato come "magazzino" Github e Github Desktop. Per fare sviluppare il programma invece è stato utilizzato l'editor NetBeans versione 11.1. Il Gantt è stato creato grazie alla versione 1.9.1 di ProjectLibre. 

## Progettazione

Questo capitolo descrive esaustivamente come deve essere realizzato il
prodotto fin nei suoi dettagli. Una buona progettazione permette
all’esecutore di evitare fraintendimenti e imprecisioni
nell’implementazione del prodotto.

### Design dell’architettura del sistema

Descrive:

-   La struttura del programma/sistema lo schema di rete...

-   Gli oggetti/moduli/componenti che lo compongono.

-   I flussi di informazione in ingresso ed in uscita e le
    relative elaborazioni. Può utilizzare *diagrammi di flusso dei
    dati* (DFD).

-   Eventuale sitemap

### Design dei dati e database

Descrizione delle strutture di dati utilizzate dal programma in base
agli attributi e le relazioni degli oggetti in uso.

### Schema E-R, schema logico e descrizione.

Se il diagramma E-R viene modificato, sulla doc dovrà apparire l’ultima
versione, mentre le vecchie saranno sui diari.

### Design delle interfacce

Descrizione delle interfacce interne ed esterne del sistema e
dell’interfaccia utente. La progettazione delle interfacce è basata
sulle informazioni ricavate durante la fase di analisi e realizzata
tramite mockups.

### Design procedurale

Descrive i concetti dettagliati dell’architettura/sviluppo utilizzando
ad esempio:

-   Diagrammi di flusso e Nassi.

-   Tabelle.

-   Classi e metodi.

-   Tabelle di routing

-   Diritti di accesso a condivisioni …

Questi documenti permetteranno di rappresentare i dettagli procedurali
per la realizzazione del prodotto.

## Implementazione

In questo capitolo dovrà essere mostrato come è stato realizzato il
lavoro. Questa parte può differenziarsi dalla progettazione in quanto il
risultato ottenuto non per forza può essere come era stato progettato.

Sulla base di queste informazioni il lavoro svolto dovrà essere
riproducibile.

In questa parte è richiesto l’inserimento di codice sorgente/print
screen di maschere solamente per quei passaggi particolarmente
significativi e/o critici.

Inoltre dovranno essere descritte eventuali varianti di soluzione o
scelte di prodotti con motivazione delle scelte.

Non deve apparire nessuna forma di guida d’uso di librerie o di
componenti utilizzati. Eventualmente questa va allegata.

Per eventuali dettagli si possono inserire riferimenti ai diari.

## Test

### Protocollo di test

Definire in modo accurato tutti i test che devono essere realizzati per
garantire l’adempimento delle richieste formulate nei requisiti. I test
fungono da garanzia di qualità del prodotto. Ogni test deve essere
ripetibile alle stesse condizioni.


|Test Case      | TC-001                               |
|---------------|--------------------------------------|
|**Nome**       |Import a card, but not shown with the GUI |
|**Riferimento**|REQ-012                               |
|**Descrizione**|Import a card with KIC, KID and KIK keys with no obfuscation, but not shown with the GUI |
|**Prerequisiti**|Store on local PC: Profile\_1.2.001.xml (appendix n\_n) and Cards\_1.2.001.txt (appendix n\_n) |
|**Procedura**     | - Go to “Cards manager” menu, in main page click “Import Profiles” link, Select the “1.2.001.xml” file, Import the Profile - Go to “Cards manager” menu, in main page click “Import Cards” link, Select the “1.2.001.txt” file, Delete the cards, Select the “1.2.001.txt” file, Import the cards |
|**Risultati attesi** |Keys visible in the DB (OtaCardKey) but not visible in the GUI (Card details) |


### Risultati test

Tabella riassuntiva in cui si inseriscono i test riusciti e non del
prodotto finale. Se un test non riesce e viene corretto l’errore, questo
dovrà risultare nel documento finale come riuscito (la procedura della
correzione apparirà nel diario), altrimenti dovrà essere descritto
l’errore con eventuali ipotesi di correzione.

### Mancanze/limitazioni conosciute

Descrizione con motivazione di eventuali elementi mancanti o non
completamente implementati, al di fuori dei test case. Non devono essere
riportati gli errori e i problemi riscontrati e poi risolti durante il
progetto.

## Consuntivo

Consuntivo del tempo di lavoro effettivo e considerazioni riguardo le
differenze rispetto alla pianificazione (cap 1.7) (ad esempio Gannt
consuntivo).

## Conclusioni

Quali sono le implicazioni della mia soluzione? Che impatto avrà?
Cambierà il mondo? È un successo importante? È solo un’aggiunta
marginale o è semplicemente servita per scoprire che questo percorso è
stato una perdita di tempo? I risultati ottenuti sono generali,
facilmente generalizzabili o sono specifici di un caso particolare? ecc

### Sviluppi futuri
  Migliorie o estensioni che possono essere sviluppate sul prodotto.

### Considerazioni personali
  Cosa ho imparato in questo progetto? ecc

## Bibliografia

### Bibliografia per articoli di riviste
1.  Cognome e nome (o iniziali) dell’autore o degli autori, o nome
    dell’organizzazione,

2.  Titolo dell’articolo (tra virgolette),

3.  Titolo della rivista (in italico),

4.  Anno e numero

5.  Pagina iniziale dell’articolo,

### Bibliografia per libri


1.  Cognome e nome (o iniziali) dell’autore o degli autori, o nome
    dell’organizzazione,

2.  Titolo del libro (in italico),

3.  ev. Numero di edizione,

4.  Nome dell’editore,

5.  Anno di pubblicazione,

6.  ISBN.

### Sitografia

1.  URL del sito (se troppo lungo solo dominio, evt completo nel
    diario),

2.  Eventuale titolo della pagina (in italico),

3.  Data di consultazione (GG-MM-AAAA).

**Esempio:**

-   http://standards.ieee.org/guides/style/section7.html, *IEEE
    Standards Style Manual*, 07-06-2008.

## Allegati

Elenco degli allegati, esempio:

-   Diari di lavoro

-   Codici sorgente/documentazione macchine virtuali

-   Istruzioni di installazione del prodotto (con credenziali
    di accesso) e/o di eventuali prodotti terzi

-   Documentazione di prodotti di terzi

-   Eventuali guide utente / Manuali di utilizzo

-   Mandato e/o Qdc

-   Prodotto

-   …


