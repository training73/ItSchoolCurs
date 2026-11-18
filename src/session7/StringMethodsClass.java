package session7;

import java.util.Locale;

public class StringMethodsClass {

    static void main() {

        String str1 = "Hello world";
        String str2 = "hello world";

        System.out.println("equals? :" +(str1.equals(str2)) );
        System.out.println("equals ignore case? " + str1.equalsIgnoreCase(str2));

        System.out.println("dimensiune: " + str1.length());
        System.out.println("litera de pe pozitia 1: " + str1.charAt(1));
        System.out.println("pozitia lui 'o' :" + str1.indexOf('o'));
        System.out.println("substring de la 1 la 4 : " + str1.substring(1,4));
        System.out.println("substring de la 2: " + str1.substring(2));
        System.out.println("lower: " + str1.toLowerCase());
        System.out.println("upper: " + str1.toUpperCase());
        System.out.println("incepe cu H?: " + str1.startsWith("H"));
        System.out.println("incepe cu B?: " + str1.startsWith("B"));
        System.out.println("incepe cu Hel?: " + str1.startsWith("Hel"));
        System.out.println("se termina cu ld?: " +  str1.endsWith("ld"));
        System.out.println("folosim trim: " + ("He llo            ".trim())  + "world");
        System.out.println("replace o with P: " + str1.replace('o', 'P'));

        System.out.println("locatia lui str1: " + str1.hashCode());
        str1 = str1.replace('o', 'P');
        System.out.println("locatia lui str1: " + str1.hashCode());


    }
}