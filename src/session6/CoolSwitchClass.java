package session6;

public class CoolSwitchClass {
    static void main() {

        String day = "Friday";

        switch (day){
            case "Monday" -> System.out.println("today is Monday");
            case "Tuesday" -> System.out.println("today is Tuesday");
            case "Wednesday" -> System.out.println("today is Wednesday");
            case "Thursday" -> System.out.println("today is Thursday");
            case "Friday" ->
            {
                System.out.println("today is Friday");
                System.out.println("still Friday");
            }
            default -> System.out.println("Weekday");
        }

    }
}
