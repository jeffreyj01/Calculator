import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*
    Our Main Class
     */
    public static void main(String[] args) {
        //Initialize fields
        double num1 = 0;
        double num2 = 0;
        char operator;
        double result = 0;

        //Scanner to read console input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");

        while(!input.hasNextDouble())
        {
            System.out.println("Invalid Input. Please enter a number: ");
            input.next();
        }
        num1 = input.nextDouble();

        System.out.print("Enter your math sign: ");


        operator = input.next().charAt(0);

        if(operator != '+')
        {
            input.nextLine();
        }

        System.out.print("Enter second number: ");

        while(!input.hasNextDouble())
        {
            System.out.println("Invalid Input. Please enter a number: ");
            input.next();
        }
        num2 = input.nextDouble();

        if(operator == '+') {
            result = num1 + num2;
        }
        else if(operator == '-') {
            result = num1 - num2;
        }
        else if(operator == '*') {
            result = num1 * num2;
        }
        else if(operator == '/') {
            if(num2 == 0) {
                System.out.println("Cannot divide by zero");
            }
            result = num1 / num2;
        }

        input.close();
        System.out.println("The answer to " + num1 + " " + operator + " " + num2 + " " + "="
                + " " + result);


/*
        Calculate calc = new Calculate();

        if(operator == '+'){
            result = calc.additionMethod(num1, num2);
        }
        else if(operator == '-'){
            result = calc.subtractionMethod(num1, num2);
        }
        else if(operator == '*'){
            result = calc.multiplicationMethod(num1, num2);
        }
        else if(operator == '/'){
            result = calc.divisionMethod(num1, num2);
        }
*/

    }
}
