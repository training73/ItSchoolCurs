package session8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass {

    static void main() {

        // Data si ora curenta
        LocalDateTime now = LocalDateTime.now();

        // Programam o intalnire peste 2 zile
        LocalDateTime meeting = now.plusDays(2);

        System.out.println("Acum: " + now);
        System.out.println("Intalnirea: " + meeting);

        // Verificam daca intalnirea este in viitor
        System.out.println("Este in viitor? " + meeting.isAfter(now));

        // Extragem informatii despre intalnire
        System.out.println("An: " + meeting.getYear());
        System.out.println("Luna: " + meeting.getMonth());
        System.out.println("Ziua: " + meeting.getDayOfMonth());
        System.out.println("Ora: " + meeting.getHour());
        System.out.println("Minute: " + meeting.getMinute());

        // Afisare cu pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("Intalnire formatata: " + meeting.format(formatter));

        // Introducem o data si o ora personalizata
        String text = "19-12-2025 14:30";

        LocalDateTime customMeeting = LocalDateTime.parse(text, formatter);

        System.out.println("Intalnire introdusa: " + customMeeting);

        // Transformam LocalDateTime in LocalDate
        System.out.println("Doar data: " + customMeeting.toLocalDate());

//        Pattern	            Rezultat
//        dd-MM-yyyy	        19-12-2025
//        dd/MM/yyyy	        19/12/2025
//        yyyy.MM.dd	        2025.12.19
//        dd MMM yyyy	        19 Dec 2025
//        dd MMMM yyyy	        19 December 2025
//        dd-MM-yyyy HH:mm	    19-12-2025 14:30
//        dd-MM-yyyy HH:mm:ss	19-12-2025 14:30:45
//        yyyy-MM-dd HH:mm:ss	2025-12-19 14:30:45
    }
}
