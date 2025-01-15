package Es1;

import java.util.*;


public class Books {
    private List<Integer> prezzo = Arrays.asList(10, 110, 120, 80, 300);

    public void stampaLibriCostosi() {
        List<Integer> libriCostosi = prezzo.stream().filter(n -> n > 100).toList();
        System.out.println("Libri costosi: " + libriCostosi);
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.stampaLibriCostosi();
    }

}
