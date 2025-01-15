package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

    /*
    * stream è una sequenza di elementi che vengono utilizzati come sorgente dati
    * per operazioni - elaboro questi dati (con una pipeline)
    * produco un output
    * creo uno stream a partire da una sorgente
    * effettuo operazioni (trasformazioni, filtro, aggregazione, etc)
    * termino -> ho un risultato
    *
    * alcuni metodi
    * filter() filtra gli elementi
    * map(Function) trasformare elementi
    * sorted() ordinare
    * forEach() per ogni, esegue operazioni su ogni elemento
    * limit(n) limita il numero di elementi
     */

    public static void main(String[] args) {

        //proviamo attraverso stream a filtrare i num pari da una lista
        //asList crea una lista a partire da una def di tipo array (elenco)
        List<Integer> numeri = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        //filtrare i numeri pari
        //ottenere un'altra lista solo di numeri pari
        List<Integer> pari = numeri.stream()
                                    .filter(n -> n % 2 == 0)
                                    .toList(); //collect(Collectors.toList())
        System.out.println(numeri);
        System.out.println(pari); //avrò solo i pari

        //ragionando per indici sulla lista
        /*IntStream.range(0,numeri.size())
                .forEach(i->);
         */

        //stream, convertiamo una lista di stringhe in maiuscolo
        List<String> parole = Arrays.asList("mario","luigi","roberta");
        //trasformare queste parole in maiuscolo
        parole.stream()
                .map(parola -> parola.toUpperCase())
                .forEach(parola -> System.out.println(parola));


        //ordiniamo una lista di numeri
        List<Integer> listaNumeri = Arrays.asList(5,39,2,3,100,-1);

        //ordinare i numeri
        listaNumeri.stream()
                .sorted((a,b)->a.compareTo(b))
                .forEach(numero -> System.out.print(numero +  " "));

    }



}
