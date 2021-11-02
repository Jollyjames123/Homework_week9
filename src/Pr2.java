import java.util.Scanner;

/**
 * 2. Re write the student mark sheet programme using if else and while loop.
 */

public class Pr2 {

    static int rollNo, math, science, english, total;
    static double percentage;
    static String name, result, grade;


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter name : ");
        name = in.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo = in.nextInt();
        System.out.print("Enter Maths Marks: ");
        math = in.nextInt();
        while (math < 0 || math > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Enter Maths Marks again : ");
            math = in.nextInt();
        }

        System.out.print("Enter Science Marks: ");
        science = in.nextInt();
        while (science < 0 || science > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Enter Science Marks again : ");
            science = in.nextInt();
        }
        System.out.print("Enter English Mark: ");
        english = in.nextInt();
        while (english < 0 || english > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Enter English Marks again : ");
            english = in.nextInt();
        }

        in.close();
        total = math + science + english;
        percentage = total / 3;
        if (percentage >= 35 && math >= 35 && science >= 35 && english >= 35) {
            result = "Pass";
        } else
            result = "Fail";
        showGrade(); //calling method
        if (math < 0 || math > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100"); //error message
        } else {
            printMarkSheet(); //printing the marksheet
        }
    }

    public static void showGrade() {
        if (percentage >= 80 && math >= 35 && science >= 35 && english >= 35) {
            grade = "A+";
        } else if (percentage >= 60 && percentage < 80 && math >= 35 && science >= 35 && english >= 35) {
            grade = "A";
        } else if (percentage >= 50 && percentage < 60 && math >= 35 && science >= 35 && english >= 35) {
            grade = "B";
        } else if (percentage >= 35 && percentage < 50 && math >= 35 && science >= 35 && english >= 35) {
            grade = "C";
        } else {
            grade = "FAIL";
        }
    }

    public static void printMarkSheet() {

        System.out.println("________________________________________");
        System.out.println("|                                      |");
        System.out.println("|             Mark Sheet               |");
        System.out.println("|______________________________________|");
        System.out.println("|   Name       :       " + name + "             |");
        System.out.println("|   Roll No    :       " + rollNo + "               |");
        System.out.println("|______________________________________|");
        System.out.println("|   Subjects   :      Marks            |");
        System.out.println("|______________________________________|");
        System.out.println("|   Math       :      " + math + "               |");
        System.out.println("|   Science    :      " + science + "               |");
        System.out.println("|   English    :      " + english + "               |");
        System.out.println("|______________________________________|");
        System.out.println("|   Total      :      " + total + "              |");
        System.out.println("|______________________________________|");
        System.out.println("|   Percentage :      " + percentage + "             |");
        System.out.println("|   Result     :      " + result + "             |");
        System.out.println("|   Grade      :      " + grade + "              |");
        System.out.println("|______________________________________|");

    }
}
