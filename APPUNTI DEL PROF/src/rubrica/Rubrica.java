package rubrica;

//package necessario per le collections
import java.util.Map;
import java.util.HashMap;

/*
*  ESERCIZIO 3 S2/L2
*  Scrivere una classe java per modellare una rubrica telefonica attraverso un HashMap
*  lista di contatti: nome e telefono
*  francesco morabito 328 80000000  ("Francesco Morabito", "328 80000000")
*  mario rossi  335 6700000
*  HashMap -> (chiave,valore)
*  Operazioni richieste / Metodi
*  1 inserimento di un contatto in rubrica <Nome,telefono>
*  2 cancellazione di un contatto a partire dal Nome
*  3 ricerca di una persona di cui conosco il telefono
*  4 ricerca del numero di telefono a partire da una persona (chiave)
*  5 stampa di tutta la rubrica (lista dei contatti)
 */

import java.util.HashMap;

public class Rubrica {

    //istanzio un oggetto di tipo HashMap (mappa / collezione)
    //rubrica (nome è una stringa, telefono è una stringa)
    //chiave sarà String, telefono sarà String
    private static Map<String,String> rubrica = new HashMap<>();

    //1 metodo per inserire un contatto in rubrica
    public static void aggiungiContatto(String nome, String telefono) {
        rubrica.put(nome,telefono);
    }

    //2 cancellazione di un contatto a partire dal nome (che è la chiave)
    public static void rimuoviContatto(String nome) {
        rubrica.remove(nome);
    }

    //3 Ricerca di una persona by telefono
    //stringaUno == stringaDue  ATTENZIONE:non confronta i valori bensì i riferimenti di memoria
    private static void trovaPersonaPerTelefono(String telefono) {
        //scorro la mappa
        for(String nome : rubrica.keySet()) {
            //se il telefono passato è uguale al contenuto dell elemento della rubrica
            if(telefono.equals(rubrica.get(nome))) {
                //lo stampo
                System.out.println("telefono trovato, per "+ nome);
                return;
                //esco
            }
        }
    }

    //4 Ricerca di un telefono a partire dalla persona (chiave)
    private static void trovaTelefonoPerPersona(String nome) {
        String telefono = rubrica.get(nome);
        System.out.println(telefono!=null ? telefono : "Non trovato");
        /*if (telefono!=null)
            System.out.println(telefono);
        else
            System.out.println("Persona non presente in rubrica");   */
    }

    //5 stampa i contatti in rubrica
    private static void stampaRubrica() {
        //keySet() restituisce una collezione (Set) delle chiavi della mappa
        for(String nome: rubrica.keySet()) {
            //per ogni chiave della mia mappa (NOME)
            //<nome,telefono>
            //<nome,telefono>
            //<nome,telefono>
            //<nome,telefono>

            System.out.println("Nome: "+ nome + ", telefono: " + rubrica.get(nome));
        }

      /*  rubrica.entrySet()
                .stream()
                .forEach(
                        entry -> System.out.println("Nome " + entry.getKey() + " telefono "+ entry.getValue());
                );

       */
    }



    // STACK (rif memoria)          HEAP (area di memoria che contiene oggetto)
    //Persona francesco        =     new Persona("Francesco", "Morabito");
    //francesco = null;
    //interviene Garbage Collector (lo spazzino della JVM)
    //pulisce e ottimizza la memoria

    }
