package session9;

import java.util.ArrayList;

public class ArrayListDemo {

    static void main() {

        ArrayList<String> students = new ArrayList<>();

        System.out.println(students);

        students.add("Marcel");
        students.add("Marcela");
        students.add("Flavian");
        students.add("Marcus");

        System.out.println(students);

        students.remove("Marcel");
        System.out.println(students);
        students.remove(0);
        System.out.println(students);
        students.set(0,"Flavius");
        System.out.println(students);

        students.add("Marcel");
        students.add("Marcela");

        for(String nume : students){
            System.out.println(nume);
        }

        for(int i=0; i<students.size(); i++){
            System.out.println("studentul de pe pozitia i: " + i + " are numele: " + students.get(i));
        }

        System.out.println(students.get(2));

        System.out.println(students.contains("Marcel"));

        students.clear();
        System.out.println(students);
    }

}
