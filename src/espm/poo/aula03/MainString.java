package espm.poo.aula03;

public class MainString {

    public static void main(String[] args) {
        String n1 = "Humberto";
        String n2 = "Doisberto";
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        n2 = n2.replaceAll("Dois", "Hum");
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);

        if (n1.equals(n2)) { // Comparacao entre Strings
            System.out.println(n1 + " == " + n2);
        } else {
            System.out.println(n1 + " != " + n2);
        }

        if (n1 == n2) { // Comparacao entre Strings ERRADO
            System.out.println(n1 + " == " + n2);
        } else {
            System.out.println(n1 + " != " + n2);
        }

        String n3 = "ESPM";
        String n4 = "ESPM";
        if (n3 == n4) {
            System.out.println(n3 + " == " + n4);
        } else {
            System.out.println(n3 + " != " + n4);
        }

    }
    
}
