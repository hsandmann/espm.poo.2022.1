package espm.poo.aula09;

import java.util.Scanner;

public class MainCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("a: ");
                double a = scanner.nextDouble();
                System.out.print("b: ");
                double b = scanner.nextDouble();
                System.out.print("operacao [+-/*^!]: ");
                scanner.nextLine();
                String op = scanner.nextLine();
                if (op.equals("!")) {
                    break;
                }
                double x = op.equals("-") ? sub(a, b) :
                        op.equals("+") ? add(a, b) :
                        op.equals("*") ? mul(a, b) :
                        op.equals("/") ? div((int) a, (int) b) :
                        op.equals("^") ? exp(a, b) :
                        0;

                System.out.println(a + op + b + " = " + x);
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.err.println("Erro na operacao: " + e.getMessage());
            }
        }
    }

    private static double sub(double a, double b) {
        return a - b;
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double mul(double a, double b) {
        return a * b;
    }

    private static double div(int a, int b) {
        return a / b;
    }

    private static double exp(double a, double b) {
        return Math.pow(a, b);
    }

}
