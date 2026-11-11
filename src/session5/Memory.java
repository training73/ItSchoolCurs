package session5;

public class Memory {

    public static void main(String[] args) {

        // ==========================================
        // 1. COMPARING PRIMITIVE DATA TYPES
        // ==========================================

        int age = 30;
        int age2 = 31;
        int age3 = 30;

        // Pentru tipurile primitive, operatorul == compară valorile.
        //
        // 30 == 31 -> false
        System.out.println(age == age2);

        // 30 == 30 -> true
        System.out.println(age == age3);


        // ==========================================
        // 2. OBJECT REFERENCES AND THE == OPERATOR
        // ==========================================

        // Operatorul new creează un obiect String nou în memorie.
        // Chiar dacă două obiecte conțin același text,
        // ele pot avea referințe diferite.

        String hello1 = new String("hello");
        String hello2 = new String("Hello");
        String hello3 = hello1;
        String hello4 = new String("hello");

        // Pentru obiecte, operatorul == compară referințele,
        // nu conținutul obiectelor.
        //
        // hello1 și hello2 sunt obiecte diferite.
        // Referințele lor sunt diferite.
        System.out.println(hello1 == hello2); // false

        // hello1 și hello4 conțin același text,
        // dar sunt două obiecte diferite.
        System.out.println(hello1 == hello4); // false

        // hello3 primește referința către același obiect
        // la care se referă și hello1.
        // Ambele variabile indică același obiect.
        System.out.println(hello1 == hello3); // true


        // ==========================================
        // 3. COMPARING OBJECT CONTENT WITH equals()
        // ==========================================

        // Metoda equals() compară conținutul obiectelor String,
        // nu referințele acestora.

        // String-urile au conținut diferit:
        // "hello" nu este egal cu "Hello".
        // Compararea ține cont de literele mari și mici (case-sensitive).
        System.out.println(hello1.equals(hello2)); // false

        // String-urile au același conținut: "hello".
        // Chiar dacă sunt obiecte diferite, equals() returnează true.
        System.out.println(hello1.equals(hello4)); // true

        // hello1 și hello3 indică același obiect,
        // deci conținutul lor este, evident, identic.
        System.out.println(hello1.equals(hello3)); // true

    }
}