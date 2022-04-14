package espm.poo.ex2;

public class PessoaFisica extends Cliente {

    public PessoaFisica() {
        super();
    }

    private String cpf;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "{nome:" + getSobrenome() + ", cpf:" + getCpf() + "}";
    }

}
