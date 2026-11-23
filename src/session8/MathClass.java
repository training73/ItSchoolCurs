package session8;

public class MathClass {
    static void main() {

        int a = 10;
        int b = 11;
        int min = Math.min(a,b);
        System.out.println(min);
        int max = Math.max(a,b);
        System.out.println(max);
        System.out.println( Math.divideExact(a,b) );
        a=2;
        b=3;
        System.out.println(Math.pow(a,b));
        System.out.println(Math.PI);
    }
}
