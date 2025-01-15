import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Test {
    /*
    senza parametro
    () -> System.out.prinln("Ciao")

    con un parametro
    (x) -> x*x

    somma
    (x,y) -> x + y
     */

    public static void main(String[] args) {
        List<String> nomi = new ArrayList<>();
        nomi.add("marop");
        nomi.add("francesca");
        nomi.add("laura");
        nomi.sort((a, b) -> a.compareTo(b));

        Runnable runnable = () -> System.out.println("Ciao");
        runnable.run();

        Operazione somma = Integer::sum;

        Verifica isPari = (x) -> x % 2 == 0;
        System.out.println("Il numero 7 è pari? " + isPari.verifica(7) );
    }
}

