package session8;

import java.util.Random;

public class RandomClass {
    static void main() {

        Random random = new Random();

        int zar = random.nextInt(1,7);
        System.out.println(zar);

        double numar = random.nextDouble(0.0, 100.0);
        System.out.println(numar);

        String[] name = {"Marcel", "Marcela", "Marcus"};
        System.out.println(name[random.nextInt(name.length)]);
        System.out.println(name[random.nextInt(0,2)]);

        System.out.println(random.nextBoolean());
    }
}
