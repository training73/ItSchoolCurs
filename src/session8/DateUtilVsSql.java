package session8;

import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Instant;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class DateUtilVsSql {

    static void main() {

        // 1. JAVA.UTIL.DATE
        // Momentul inregistrarii comenzii

        Date utilDate = new Date();

        System.out.println("Util Date: " + utilDate);

        // Formatare java.util.Date
        SimpleDateFormat utilFormatter =
                new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println("Data formatata: "
                + utilFormatter.format(utilDate));


        // 2. JAVA.SQL.DATE
        // Data estimata a livrarii (fara ora)

        LocalDate deliveryDate = LocalDate.now().plusDays(5);

        java.sql.Date sqlDate =
                java.sql.Date.valueOf(deliveryDate);

        System.out.println("SQL Date: " + sqlDate);

        // Formatare SQL Date
        DateTimeFormatter sqlFormatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Livrare formatata: "
                + sqlDate.toLocalDate().format(sqlFormatter));


        // 3. JAVA.SQL.TIMESTAMP
        // Momentul exact al inregistrarii comenzii

        Timestamp timestamp =
                Timestamp.from(Instant.now());

        System.out.println("SQL Timestamp: " + timestamp);

        // Formatare Timestamp
        DateTimeFormatter timestampFormatter =
                DateTimeFormatter.ofPattern(
                        "dd-MM-yyyy HH:mm:ss"
                );

        System.out.println("Timestamp formatat: "
                + timestamp.toLocalDateTime()
                .format(timestampFormatter));


        // 4. CONVERSII

        // LocalDate -> java.sql.Date
        java.sql.Date convertedDate =
                java.sql.Date.valueOf(deliveryDate);

        // LocalDateTime -> Timestamp
        Timestamp convertedTimestamp =
                Timestamp.valueOf(timestamp.toLocalDateTime());

        System.out.println("Data convertita: " + convertedDate);
        System.out.println("Timestamp convertit: "
                + convertedTimestamp);
    }
}
