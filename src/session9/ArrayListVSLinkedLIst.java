package session9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedLIst {

    static void main() {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
//        ArrayList<String> arrayList = new ArrayList<>();
//        LinkedList<String> linkedList = new LinkedList<>();

        int size = 100000;
        String nume = "Marcel";

        for (int i = 0; i<size; i++){
            arrayList.add(nume);
            linkedList.add(nume);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < size ; i++)
        {
            arrayList.get(size/2);
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-start  + " arrayList access half");

        start = System.currentTimeMillis();
        for (int i = 0; i<size; i++)
        {
            linkedList.get(size/2);
        }
        stop=System.currentTimeMillis();
        System.out.println(stop-start + " Linlked List access hald");

//        ----------------------------

        start = System.currentTimeMillis();
        for(int i = 0; i< size ; i++){
            arrayList.add(0,"x");
        }
        stop = System.currentTimeMillis();

        System.out.println(stop-start + " ArrayList Add");

        start = System.currentTimeMillis();
        for(int i = 0; i< size ; i++){
            linkedList.add(0,"x");
        }
        stop = System.currentTimeMillis();
        System.out.println(stop-start + " LinkedList Add");
    }

}
