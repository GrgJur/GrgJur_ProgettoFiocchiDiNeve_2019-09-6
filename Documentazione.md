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
  - Verrà esposto un triangolo in una schermata e bisognerà cliccare in vari punti della schermata per poter "tagliare" il                   triangolo in vari modi
  - L'interfaccia dove è presente il triangolo, deve anche presentare un bottone di reset e uno di salvataggio delle modifiche
  - Il seguente applicativo probabilmente è già stato svolto da qualche altro programmatore, quindi questa non è la prima volta che         viene creato il seguente programma, sicuramente ci saranno differenze nel codice sorgente
  - Gli utenti che interagiscono con il programma non hanno bisogno di alcuna conoscenza tecnica
  - Per il programmatore che implementa il seguente applicativo, deve avere una buona conoscenza di java, o javascript nel caso si           utilizzi questo linguaggio, per fare il programma
  - 
  
### Analisi e specifica dei requisiti

  |**ID**	|**Nome**			|**Priorità**|**Vers**|**Note**  |
  |----|------------|--------|----|------|
  |Req-1 |Il software deve essere scritto in JAVA o JS|1|1.0|-|
  |Req-2|Occorre l'utilizzo di un'interfaccia grafica|1|1.0|-|
  |Req-3|La finestra dell'interfaccia è ridimensionabile, minimo 1024x768|1|1.0|-|
  |Req-4|Deve esistere un sito con la descrizione del software|1|1.0|-|
  |Req-5|Deve essere possibile scaricare il software dal sito|1|1.0|-|
  |Req-6|Il software deve avere un'interfaccia grafica (jframe o frame)|1|1.0|-|
  |Req-7|All'avvio deve essere mostrato il triangolo da ritagliare|1|1.0|-|
  |Req-8|Il triangolo può ridimensionarsi in base alla grandezza dell'interfaccia (iniziale 50%)|1|1.0|-|
  |Req-9|I tagli (punti) del triangolo devono poter essere fatti con il mouse|1|1.0|-|
  |Req-10|I tagli (punti) del triangolo devono poter essere fatti con il mouse|1|1.0|-|
  |Req-11|Deve essere possibile resettare i punti del ritaglio|1|1.0|-|
  |Req-12|Deve esistere un tasto 'genera fiocco'|1|1.0|-|
  |Req-13|La generazione del fiocco avvenire in tempo reale (anteprima con i punti attualmente messi)|2|1.0|-|
  |Req-14|I punti devono poter essere spostati o rimossi |2|1.0|-|
  |Req-15|Il lavoro deve poter essere salvato|1|1.0|-|
  |Req-16|Il salvataggio del fiocco deve essere fatto in formato PNG o SVG tramite un bottone 'salva'|1|1.0|-|
  |Req-17|Il salvataggio deve avere dimensioni definite dall'utente|1|1.0|-|
  |Req-18|I punti devono essere salvabili in un file|1|1.0|-|
  |Req-19|I punti potranno essere importati tramite esplora file|1|1.0|-|
  |Req-20|È possibile switchare tra creazione/eliminazione punto tramite un bottone 'creazione/eliminazione'|2|1.0|-|

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
