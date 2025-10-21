Definire in un progetto Java le classi e i metodi necessari ad implementare un laboratorio di chimica.

Ogni Molecola possiede una stringa “nome”, un boolean “ione”, un enum "composto" e un arraylist di Atomi.
Ogni Atomo è una classe astratta e possiede un intero “numeroAtomico”, un double “pesoAtomico” una stringa “simbolo” che lo rappresenta e un int “numeroOssidazione”.
Da Atomo derivano 4 classi: Metallo, NonMetallo, Semimetallo e GasNobile.

L’enum Composto deve contenere i valori Acido, Base, Perossido, Ossido, Anidride e Sale.

La classe Atomo possiede un metodo getPesoAtomico() che restituisce il valore del numero atomico, ma se implementata nelle classi derivate ne modifica l'implementazione
a. In Metallo resta invariato
b. In NonMetallo equivale al numero atomico moltiplicato per il numero di caratteri da cui è composto il simbolo
c. In Semimetallo equivale alla metà del numero atomico
d. In GasNobile equivale al reciproco del numero atomico

La classe Atomo possiede un metodo isCompatibile(Atomo altro) che restituisce vero se l'altro atomo passato input è dello stesso tipo (metallo, non metallo...) dell'atomo stesso. Definire una corretta implementazione per tutte le sottoclassi.

Implementare i seguenti metodi per la classe Molecola:
- double getPesoMolecolare(), ottenuto dalla somma dei pesi atomici della molecola

- impostaIone(), verifica che la somma totale dei numeri di ossidazione degli atomi che compongono una molecola sia 0 e modifica il valore dell'attributo ione di conseguenza

- boolean isNobile(), restituisce vero se la molecola contiene atomi di gas nobili

- boolean isAnidride(), restituisce vero se la molecola contiene almeno un non-metallo e almeno un atomo di ossigeno
