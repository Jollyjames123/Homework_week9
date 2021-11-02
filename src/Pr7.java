import java.util.ArrayList;

/**
 * 7. Write a Java program to test an array list is empty or not. Define array list with
 * underground tube names
 */

public class Pr7 {

    public static void main(String[] args) {
        ArrayList underground = new ArrayList();
        underground.add("Circle");
        underground.add("Central line");
        underground.add("District");
        underground.add("Hammersmith & City");
        underground.add("Jubilee");
        underground.add("Metropolitan");
        underground.add("Northern");
        underground.add("Piccadilly");
        underground.add("Victoria");

        if (!underground.isEmpty()) {
            System.out.println("ArrayList is not Empty");
        }
    }
}
