package taskAT7;

import java.util.Scanner;

public class Calculator {

    public void add(int operand1, int operand2) {
        System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
    }

    public void sub(int operand1, int operand2) {
        System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
    }

    public void mul(int operand1, int operand2) {
        System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
    }

    public void div(int operand1, int operand2) {
        System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
    }

    public void calculate() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first operand ");
            int operand1 = sc.nextInt();
            System.out.println("Enter second operand ");
            int operand2 = sc.nextInt();
            System.out.println("Enter symbol ");
            String operation = sc.next();
            System.out.println("First operand = " + operand1 + " Second operand = " + operand2 + " Symbol " + operation);


            switch (operation) {
                case "+":
                    add(operand1, operand2);
                    break;
                case "-":
                    sub(operand1, operand2);
                    break;
                case "*":
                    mul(operand1, operand2);
                    break;
                case "/":
                    div(operand1, operand2);
                    break;
                default:
                    System.out.println("Unknown operation! ");
            }
        } catch (ArithmeticException eAR) {
            System.out.println("It is forbidden to divide by 0 " + eAR);
        }
    }
}