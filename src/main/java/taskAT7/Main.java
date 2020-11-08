package taskAT7;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("First operand: ");
            int operand1 = sc.nextInt();
            System.out.print("Second operand: ");
            int operand2 = sc.nextInt();
            System.out.print("Symbol: ");
            String operation = sc.next();

            switch (operation) {
                case "+":
                    methods.add(operand1, operand2);
                    break;
                case "-":
                    methods.sub(operand1, operand2);
                    break;
                case "*":
                    methods.mul(operand1, operand2);
                    break;
                case "/":
                    methods.div(operand1, operand2);
                    break;
                default:
                    System.out.println("Unknown operation! ");
            }

        } catch (ArithmeticException eAR) {
            System.out.println("It is forbidden to divide by 0 " + eAR);
        }

    }
}
