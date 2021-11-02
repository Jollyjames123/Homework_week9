import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */

public class Pr9 {
    public static void main(String[] args) {
        Map<String, Integer> people = new java.util.HashMap<>();
        people.put("A", 10);
        people.put("B", 20);
        people.put("C", 30);
        people.put("D", 40);

        //using the for-each loop to get the values
        for (Integer i : people.values()) {
            System.out.println(i);
        }
    }
}
