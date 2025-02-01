public class Main {
    public static void main(String[] args) {
       /*

Componenti:
Città
-un granaio,
-un porto commerciale
-caserma.

Ogni giorno la città affronta:
-produzioni di risorse,
-scambi commerciali-
-attività nella caserma.

Granaio
-Produce quotidianamente una quantità casuale di risorse.
-Ha un limite massimo di risorse che può gestire.
*eccezione controllata MassimoRisorseSuperatoException --> quando il limite massimo viene superato.


Porto Commerciale
Ogni giorno:
-invia una quantità casuale di risorse ad un’altra città.
-riceve una quantità casuale di risorse ad un’altra città.
*eccezione controllata ScarsitàRisorseException --> se non ci sono risorse sufficienti per lo scambio.

Caserma
Ogni giorno:
-addestra un numero randomico di soldati per svolgere attività:
                                                              ..ronde nelle strade
                                                              ..affrontare eventi straordinari: invasioni o rivolte.
Ogni soldato:
            #costa 5 risorse del granaio : lanciare l’eccezione AddestramentoFallitoException --> se non è possibile addestrare un certo numero di soldati bisognerà

-randomicamente, vi è la probabilità del 40% di avere una rivolta in città, alla quale bisogna rispondere con almeno 20 soldati.
Se non sarà possibile verrà --> lanciata l’eccezione controllata RivoltaAvvenutaException
e il granaio verrà razziato, portando le sue risorse a zero e il numero dei soldati verrà dimezzato.
-randomicamente, vi è la probabilità del 20% di avere un’invasione barbarica, alla quale bisogna rispondere con 40 soldati.
Se non sarà possibile contrastare l’invasione --> verrà sollevata un'eccezione controllata InvasioneAvvenutaException,
il granaio verrà razziato e tutti i soldati della città verranno uccisi, impostando  rispettivamento il loro valore a zero.

Main
Simula almeno dieci giorni della città.
Per semplicità, l’invio e la ricezione delle risorse vengono effettuate sulla stessa città.

        */
    }
}