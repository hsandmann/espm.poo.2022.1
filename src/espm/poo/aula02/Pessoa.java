package espm.poo.aula02;

public class Pessoa {

    public String nome;
    public int idade;
    public double salario;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
        
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("salário: " + salario);
    }

}