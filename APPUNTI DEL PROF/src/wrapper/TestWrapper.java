package wrapper;

import java.util.HashMap;
import java.util.Map;

public class TestWrapper {
     //non uso int, il primitivo, ma debbo usare il wrapper relativo, cioè Integer
    private static Map<String,Integer> votiEsami = new HashMap<>();

    public static void main(String[] args) {
        String eta = "36";
        int etaDiFrancesco = Integer.parseInt(eta); //cast utilizzando il wrapper di int
        String prezzo = "15.50";
        double price = Double.parseDouble(prezzo);  //cast esplicito utilizzando il wrapper di double
        //double d è minuscola -> primitivo
        //Double D è maiuscola -> wrapper (involucro) del primitivo
    }

}
