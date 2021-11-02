import java.util.Scanner;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Pr3 {
    public static void main(String[] args) {
        int a, i;
        int j = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        a = s.nextInt();
        int array[] = new int[a];
        int rarray[] = new int[a];
        System.out.println("Enter " + a + " values for these elements ");
        for (i = 0; i < a; i++) {
            array[i] = s.nextInt();
        }
        s.close();
        System.out.println("Reverse of an array is :");
        for (i = a; i > 0; i--, j++) {
            rarray[j] = array[i - 1];
            System.out.println(rarray[j]);

        }
    }
}
