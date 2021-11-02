import java.util.ArrayList;
import java.util.Iterator;

public class Pr5 {
    /**
     * 5. Write a Java program to iterate through all elements in an array list using
     * Iterator
     */
    public static void main(String[] args) {
        ArrayList cars = new ArrayList();
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Merc");
        cars.add("BMW");
        cars.add("KIA");
        cars.add("Nissan");
        cars.add("Vauxall");

        //iterating the array list using Iterator
        Iterator itr = cars.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
