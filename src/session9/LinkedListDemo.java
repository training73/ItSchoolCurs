package session9;

import java.util.*;

public class LinkedListDemo {

    static void main() {

        List<String> linked = new LinkedList<>();
        linked.add("Marcel");
        linked.add("Marcela");
        linked.add("Messi");
        linked.add("Ronaldo");

        System.out.println(linked.get(3));

        linked.add(3,"Flavius");
        System.out.println(linked);
        linked.remove("Messi");
        System.out.println(linked);
        linked.remove(3);
        System.out.println(linked);


        LinkedList<String> linked2 = new LinkedList<>();
        linked2.add("Marcel");
        System.out.println(linked2);
        linked2.pop();
        System.out.println(linked2);


    }

}
