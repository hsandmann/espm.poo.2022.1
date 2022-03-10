package espm.poo.aula03;

import java.util.Arrays;

public class MainArgs {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        for (String a: args) {
            System.out.println(a);
        }
        Arrays.asList(args).forEach(a -> System.out.println(a));
    }

    // Compilando na mao:
    // javac espm/poo/aula03/MainArgs.java
    // Executando na mao:
    // java espm.poo.aula03.MainArgs ola mundo
    
}
