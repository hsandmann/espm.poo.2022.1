package espm.poo.aula08;

public abstract class Pagamento {

    private final double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double efetivar() {
        double valorTotal = calculaTotal();
        return valorTotal;
    }

    protected abstract double calculaTotal();

    public double getValor() {
        return valor;
    }
    
}
