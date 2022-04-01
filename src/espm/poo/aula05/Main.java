package espm.poo.aula05;

import espm.poo.ex2.Cliente;

public class Main {

    public static void main(String[] args) {

        Cliente selmini = new Cliente();
        selmini.getConta().depositar(15);
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(25);
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(-500);
        System.out.println(selmini.getConta().getSaldo());
        
    }

}
