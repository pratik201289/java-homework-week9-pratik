package calculate;

import java.util.Scanner;

public class Calculator {

    public void addition(int a, int b) {

        int res = a + b;
        System.out.println("Addition:" + res);

    }

    public void subtraction(int a, int b) {

        int res = a - b;
        System.out.println("Subtraction:" + res);

    }

    public void division(int a, int b)  {

        try {

            int res = a / b;
            System.out.println("Division:" + res);
        } catch (Exception e) {
     //       e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
    public void multiplication(int a, int b) {

        int res = a * b;
        System.out.println("Multiplication:" + res);

    }

    public void calculateResult(int a, int b, char symbol) {


        switch (symbol) {

            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;

            default:
                System.out.println("Invalid Input");
        }

    }
}

class Main extends Calculator {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        //c1.calculateResult(10, 20, '+');
        char symbol1;
        int a, b;
        Scanner s1 = new Scanner(System.in);

        do {
            // ask users to enter numbers
            System.out.println("Enter first number:= ");
            a = s1.nextInt();
            System.out.println("Enter second number: =");
            b = s1.nextInt();
            // ask users to enter operator
            System.out.println("Choose an operator: +, -, *, or /");
            char symbol = s1.next().charAt(0);
            c1.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” : ");
            symbol1 = s1.next().charAt(0);

        } while (symbol1 == 'Y');
        s1.close();
    }
}

