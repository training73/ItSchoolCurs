package session7;

public class StringBuilderClass {

    static void main() {

        StringBuilder sb = new StringBuilder("Jello");
        System.out.println(sb.hashCode());
        sb.append(" Java");
        System.out.println(sb.hashCode());
        System.out.println(sb);

        sb.insert(2,"java");
        System.out.println(sb);

        System.out.println(sb.indexOf("a"));
        sb.reverse();
        System.out.println(sb);
    }
}
