package espm.poo.ex2;

public abstract class Cliente {

    private String nome;
    private String sobrenome;
    private Conta conta;

    public Cliente() {
        this.conta = new Conta(this);
    }

    public void setNome(String nome) {
        String[] nomes = nome.split(" ");
        this.nome = nomes[0];
        this.sobrenome = nomes[nomes.length - 1];
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
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
