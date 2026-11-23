package session8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateClass {

    public static void main(String[] args) {

        // Data inregistrarii comenzii
        LocalDate orderDate = LocalDate.now();

        // Data estimata a livrarii: peste 5 zile
        LocalDate deliveryDate = orderDate.plusDays(5);

        // Afisare date
        System.out.println("Data comenzii: " + orderDate);
        System.out.println("Data livrarii: " + deliveryDate);

        // Verificam ziua saptamanii
        System.out.println("Livrarea va avea loc: "
                + deliveryDate.getDayOfWeek());

        // Verificam daca livrarea este dupa comanda
        System.out.println("Livrarea este dupa comanda? "
                + deliveryDate.isAfter(orderDate));

        // Formatare cu pattern
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data comenzii formatata: "
                + orderDate.format(formatter));

        // Transformare String in LocalDate
        String text = "19-12-2025";

        LocalDate customDate = LocalDate.parse(text, formatter);

        System.out.println("Data introdusa: " + customDate);

        // Alt format
        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data in alt format: "
                + customDate.format(formatter2));
    }
}