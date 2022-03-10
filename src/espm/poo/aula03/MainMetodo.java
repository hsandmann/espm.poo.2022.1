package espm.poo.aula03;

import espm.poo.aula02.Pessoa;

public class MainMetodo {

    public static void main(String[] args) {
        int v = 10;
        int y = mult2(v);
        System.out.println("v: " + v);
        System.out.println("y: " + y);
        System.out.println("v: " + v);

        Pessoa vip = new Pessoa("Mariana");
        vip.salario = 10000;
        vip.imprimir();
        System.out.println("Reajuste ---");
        multSalario(vip);
        vip.imprimir();
    }

    public static int mult2(int x) {
        x = x * 2;
        return x;
    }

    public static void multSalario(Pessoa p) { // Passagem por referencia
        p.salario *= 2;
    }
    
}
