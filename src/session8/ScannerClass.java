package session8;

import java.util.Scanner;

public class ScannerClass {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele: ");
        String nume = scanner.nextLine();
        int varsta = scanner.nextInt();
        boolean traiesc = scanner.nextBoolean();

        System.out.println("Ma numesc: " + nume);
        System.out.println("Am " + varsta + " ani");
        System.out.println("Traiesc? : " + traiesc);
    }
}
