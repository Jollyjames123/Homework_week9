import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Pr6 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Ford");
        arrayList.add("BMW");
        arrayList.add("KIA");
        arrayList.add("Merc");
        arrayList.add("Honda");
        arrayList.add("Vauxall");
        arrayList.add("Nissan");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number between 0 and 6:");
        int i = scanner.nextInt();
        scanner.close();
        if (i == 0) {
            System.out.println("Ford");
        } else if (i == 1) {
            System.out.println("BMW");
        } else if (i == 2) {
            System.out.println("KIA");
        } else if (i == 3) {
            System.out.println("Merc");
        } else if (i == 4) {
            System.out.println("Honda");
        } else if (i == 5) {
            System.out.println("Vauxall");
        } else if (i == 6) {
            System.out.println("Nissan");
        } else {
            System.out.println("Invalid index number is entered");

        }

    }
}
