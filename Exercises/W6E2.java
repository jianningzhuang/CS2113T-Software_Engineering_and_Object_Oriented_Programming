import java.util.HashMap;
import java.util.Map;

public class Main {
    private static HashMap<String, Integer> roster = new HashMap<>();

    //TODO: add your methods here
    private static void addToRoster(String day) {
        if (roster.containsKey(day)) {
            Integer newVal = Integer.valueOf((roster.get(day)).intValue() + 1);
            roster.put(day, newVal);
        } else {
            roster.put(day, Integer.valueOf(1));
        }
    }

    private static void printRoster() {
        for (Map.Entry<String, Integer> entry : roster.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue().intValue());
        }
    }

    public static void main(String[] args) {
        addToRoster("Monday"); // i.e., one person signed up for Monday
        addToRoster("Wednesday"); // i.e., one person signed up for Wednesday
        addToRoster("Wednesday"); // i.e., another person signed up for Wednesday
        addToRoster("Friday");
        addToRoster("Monday");
        printRoster();
    }

}
