package session9;

import java.util.Arrays;

public class ArrayDemo {

    static void main() {

        int[] numbers = new int[10];
        System.out.println(numbers);
        System.out.println(numbers[0]);
        System.out.println(numbers[5]);
        System.out.println(numbers.length);

        for(int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println(Arrays.toString(numbers));


        int numbers2[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,2,3,2};
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        for(int nr : numbers2){
            System.out.println(nr);
        }


        int locatie =  Arrays.binarySearch(numbers2, 7);
        System.out.println("locatia/indexul lui 7 : " +locatie);


        String[] orase = new String[] {"Cluj", "Timisoara", "Bucuresti", "Iasi", "Brasov"};
        System.out.println( Arrays.binarySearch(orase, "Brasov") );
        Arrays.sort(orase);
        System.out.println(Arrays.toString(orase));
        System.out.println(Arrays.binarySearch(orase,"Brasov"));

    }

}
