package session6;

public class ForBreakClass {

    static void main() {

        int number = 12;

        for (int i = 0; i < 100; i++) {

            if (i == 6) {
                continue;
            }

            if (i == 12) {
                continue;
            }

            System.out.println(i);

            if (i == number) {
                System.out.println("am ajuns la number: " + number);
                break;
            }
        }
    }
}
