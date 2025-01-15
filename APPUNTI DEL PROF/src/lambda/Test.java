package lambda;

import java.util.*;

public class Test {

    //(parametri) -> {corpo}
    /*
    * senza parametri
    * () -> System.out.println("Ciao");
    * con un parametro
    * (x) -> x * x
    * somma
    * (x,y) -> x + y
    */

    //interfaccia Comparator che ha un metodo astratto
    //metodo compare()
    //possiamo utilizzarlo con una lamda per ordinare una lista

    public static void main (String[] args) {
        List<String> nomi = new ArrayList<>();
        nomi.add("Mario");
        nomi.add("Michele");
        nomi.add("Anna");


        //ordinamento attraverso un espressione lambda
        /*
        * SORT
        * COMPARATORE -> COMPARE ->compareTo
        * lambda
         */
        //confronto lista di Stringa
        nomi.sort((a,b)->a.compareTo(b));
        //dovremmo avere la lista nomi ordinata
        System.out.println("lista di nomi ordinati" + nomi);

        //macchine.sort((a,b)->a.getSeriale().compareTo(b.getSeriale()));

        //runnable che contiene una stampa di un Ciao
        //interfaccia nota (java util)
        Runnable runnable = () -> System.out.println("Ciao");
        //mando in esecuzione runnable (run)
        runnable.run();

        //uso una mia interfaccia personalizzata
        //tramite interfaccia funzionale Operazione
        //implemento una somma attraverso le lambda
        Operazione somma = (a,b) -> a + b;
        Operazione sottrazione = (a,b) -> a-b;
        Operazione moltiplicazione = (a,b) -> a * b;

        System.out.println("Risultato moltiplicazione " + moltiplicazione.calcola(10.5,5.4));
        System.out.println("Risultato " + somma.calcola(10,5));
        System.out.println("Risultato della sottrazione " + sottrazione.calcola(20,10));;


        //verifica se un numero è pari o dispari
        //attraverso le lambda
        //interfaccia personalizzata

        Verifica isPari = (x) -> x % 2 == 0;

        //applico la lambda
        System.out.println("il numero 7 è pari? " + isPari.verifica(7));
        System.out.println("il numero 12 è pari? " + isPari.verifica(12));

    }

}
