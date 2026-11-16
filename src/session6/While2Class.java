package session6;

public class While2Class {

    static void main() {

        boolean amBenzina = true;
        int litri = 60;
        int kilometri = 0;

        while (amBenzina){
            System.out.println("merg cu masina si mai am " + litri + " litri in rezervor si sunt la kilometru : " + kilometri);
            kilometri++;

            if((kilometri % 100) == 0){
                litri = litri - 6;
            }

            if (litri < 0){
                amBenzina = false;
            }
        }
    }
}
