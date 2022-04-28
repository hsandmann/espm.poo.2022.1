package espm.poo.aula08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAuth {

    public static void main(String[] args) {

        Cliente nereu = new Cliente("Nereu");
        Funcionario func1 = new Diretor(10);
        Diretor dir = new Diretor(20);
        Usuario usu1 = new Cliente("Rodrigo");

        List<Usuario> l = new ArrayList<>();
        l.add(nereu);
        l.add(dir);
        l.add((Usuario) func1);
        l.add(usu1);

        for (Usuario u: l) {
            System.out.print(u.getUsername() + ": ");
            String pass = new Scanner(System.in).nextLine().trim().toLowerCase();
            System.out.println(u.autenticar(pass));
        }

    }

}
