package calculate;

public class Calculator {
    //creating addition method
    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
    }

    //subtracting method
    public void subtraction(int a, int b) {
        System.out.println("Subtraction " + a + " and " + b + " is : " + (a - b));
    }

    //division method
    public void division(int a, int b) {
        System.out.println("Division " + a + " and " + b + " is : " + (a / b));
    }

    //multiplication method
    public void multiplication(int a, int b) {
        System.out.println("Multiplication " + a + " and " + b + " is : " + (a * b));
    }

    public void calculateResult(int a, int b, char symbol) {

        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '/':
                division(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            default:
                System.out.println("Please enter a valid symbol");
        }

    }
}
