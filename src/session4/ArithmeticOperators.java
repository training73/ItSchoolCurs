package session4;

public class ArithmeticOperators {

    static void main() {
        // ==========================================
        // 1. ARITHMETIC OPERATORS
        // ==========================================

        int number1 = 21;
        int number2 = 6;
        int number3 = 3;
        int number4 = 1;

        // Înmulțirea și împărțirea au prioritate față de adunare și scădere.
        // 21 - 6 / 3 = 21 - 2 = 19
        int result1 = number1 - number2 / number3;
        System.out.println("Result 1: " + result1);

        // Parantezele modifică ordinea în care sunt evaluate operațiile.
        // (21 - 6) / 3 = 15 / 3 = 5
        int result2 = (number1 - number2) / number3;
        System.out.println("Result 2: " + result2);

        // Înmulțirea și împărțirea au aceeași prioritate.
        // Când operatorii au aceeași prioritate, evaluarea se face de la stânga la dreapta.
        // 21 / 6 * 3 - 1 = 3 * 3 - 1 = 8
        //
        // ATENȚIE: Împărțirea între două numere de tip int păstrează doar partea întreagă.
        // 21 / 6 = 3, nu 3.5.
        int result3 = number1 / number2 * number3 - number4;
        System.out.println("Result 3: " + result3);

        // Parantezele schimbă ordinea operațiilor.
        // 21 / (6 * 3) - 1 = 21 / 18 - 1 = 1 - 1 = 0
        int result4 = number1 / (number2 * number3) - number4;
        System.out.println("Result 4: " + result4);

        // Casting: conversia lui number1 din int în double.
        // Astfel, împărțirea se realizează cu numere zecimale.
        // 21.0 / 18 - 1 = 1.1666... - 1 = 0.1666...
        double result5 = (double) number1 / (number2 * number3) - number4;
        System.out.println("Result 5: " + result5);


        // ==========================================
        // 2. COMPOUND ASSIGNMENT OPERATORS
        // ==========================================

        int a = 2;
        int b = 3;
        int c = 4;

        // Operatorul += adună valoarea din dreapta la valoarea existentă
        // a variabilei și atribuie rezultatul aceleiași variabile.
        //
        // a += 2 este echivalent cu a = a + 2.
        // a = 2 + 2 = 4
        a += 2;
        System.out.println("a += 2 -> " + a);

        // Putem folosi o altă variabilă în partea dreaptă.
        //
        // a += b este echivalent cu a = a + b.
        // a = 4 + 3 = 7
        a += b;
        System.out.println("a += b -> " + a);

        // În partea dreaptă putem avea o expresie formată din mai mulți operatori.
        //
        // Mai întâi se calculează b + 10 = 3 + 10 = 13.
        // Apoi rezultatul se adună la valoarea lui a = 7 + 13 = 20.
        //
        // a += b + 10 este echivalent cu a = a + (b + 10).
        a += b + 10;
        System.out.println("a += b + 10 -> " + a);

        // Operatorul /= împarte valoarea variabilei la rezultatul expresiei din dreapta.
        //
        // Mai întâi se calculează c - 2 = 4 - 2 = 2.
        // Apoi a se împarte la 2: 20 / 2 = 10.
        //
        // a /= c - 2 este echivalent cu a = a / (c - 2).
        a /= c - 2;
        System.out.println("a /= c - 2 -> " + a);

        // Același operator poate fi folosit și cu alte variabile.
        //
        // Mai întâi se calculează c - 1 = 4 - 1 = 3.
        // Apoi b se împarte la 3: 3 / 3 = 1.
        //
        // b /= c - 1 este echivalent cu b = b / (c - 1).
        b /= c - 1;
        System.out.println("b /= c - 1 -> " + b);

        // Operatorul *= înmulțește valoarea variabilei cu expresia din dreapta.
        //
        // Mai întâi se calculează b + 1 = 1 + 1 = 2.
        // Apoi c se înmulțește cu 2: 4 * 2 = 8.
        //
        // c *= b + 1 este echivalent cu c = c * (b + 1).
        c *= b + 1;
        System.out.println("c *= b + 1 -> " + c);


        // ==========================================
        // 3. RELATIONAL OPERATORS
        // ==========================================

        a = 2;
        b = 3;

        // Relational operators compară două valori și returnează un rezultat de tip boolean:
        // true (adevărat) sau false (fals).

        System.out.println("a > b: " + (a > b));     // false: 2 nu este mai mare decât 3.
        System.out.println("a >= b: " + (a >= b));   // false: 2 nu este mai mare sau egal cu 3.
        System.out.println("a < b: " + (a < b));     // true: 2 este mai mic decât 3.
        System.out.println("a <= b: " + (a <= b));   // true: 2 este mai mic sau egal cu 3.
        System.out.println("a == b: " + (a == b));   // false: 2 nu este egal cu 3.
        System.out.println("a != b: " + (a != b));   // true: 2 este diferit de 3.

    }
}