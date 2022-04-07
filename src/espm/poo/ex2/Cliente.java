package espm.poo.ex2;

public class Cliente {

    private String nome;
    private Conta conta;

    public Cliente() {
        this.conta = new Conta(this);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "{nome: " + nome + 
               " conta: " + conta + "}";
    }

}
