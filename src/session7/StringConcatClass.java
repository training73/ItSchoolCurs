package session7;

public class StringConcatClass {

    static void main() {

        String code1 = "Prod123";
        String code2 = new String("Prod123");
        String code3 = "Prod123";
        String code4 = "Prod";

        code4 = code4 + "12";
        System.out.println("valoare lui code 4: " + code4);

        System.out.println("comparam code1 cu code4: " + (code1.equals(code4)) );
        System.out.println("comparam code1 cu code3: " + (code1.equals(code3)) );
        System.out.println("comparam code1 cu code2: " + (code1.equals(code2)) );
        System.out.println("sunt acelasi obiect? " + (code1 == code2));
        System.out.println("dar code1 cu code3? " + (code1 == code3));
        System.out.println("demonstram locatiile:");
        System.out.println(System.identityHashCode(code1));
        System.out.println(System.identityHashCode(code2));
        System.out.println(System.identityHashCode(code3));
        System.out.println(System.identityHashCode(code4));

    }
}
