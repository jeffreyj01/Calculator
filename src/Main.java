import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num1, num2 = 0;
        char operator;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter your math sign: ");
        operator = input.next().charAt(0);
        System.out.print("Enter second number: ");
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
        else {
            System.out.println("Invalid input");
        }

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
