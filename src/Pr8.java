import java.util.HashSet;
import java.util.Set;

/**
 * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
 * and if else
 */

public class Pr8 {
    public static void main(String[] args) {
        //Creating a new hashset object called Set
        Set<Integer> sets = new HashSet<Integer>();

        //adding values to the set
        sets.add(4);
        sets.add(7);
        sets.add(8);

        for (int i = 1; i < 11; i++) {
            if (sets.contains(i)) {
                System.out.println(i + " was found in the set");
            }
        }
    }
}
