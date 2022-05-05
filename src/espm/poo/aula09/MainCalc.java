package espm.poo.aula09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
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
                scanner.nextLine();
                String op = null;
                while (op == null) {
                    try {
                        op = input("operacao [+-/*^!]: ", "*", "/", "!", "+", "-");
                    } catch(ESPMException e) {
                        System.err.println("Entrada inválida: " + e.getMessage());
                        throw new RuntimeException(e.getMessage(), e);
                        // continua propagando a excecao
                        // throw e;
                    }
                }
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
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.err.println("Erro na entrada: " + e.getMessage());
                scanner.nextLine();
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Operacao ok ou excecao tratada!");
            }
        }
    }

    private static String input(String msg, String... possibles) throws ESPMException {
        final Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        String line = scanner.nextLine().trim();
        for (String item : Arrays.asList(possibles)) {
            if (item.equals(line)) {
                return item;
            }
        }
        // Levanta uma excecao
        throw new ESPMException(line);
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
