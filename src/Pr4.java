import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

public class Pr4 {
    public static void main(String[] args) {
        //adding value into list
        ArrayList colours = new ArrayList();
        colours.add("Black");
        colours.add("Red");
        colours.add("Yellow");
        colours.add("Green");
        colours.add("Blue");
        colours.add("White");
        colours.add("Orange");

        //Print list using for-each loop
        for (Object collection : colours) {
            System.out.println(collection);
        }
    }
}
