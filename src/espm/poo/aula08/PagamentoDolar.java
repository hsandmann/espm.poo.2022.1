package espm.poo.aula08;

public class PagamentoDolar extends Pagamento {

    private final double cambio;
    private final double taxa;

    public PagamentoDolar(double valor, double cambio, double taxa) {
        super(valor);
        this.cambio = cambio;
        this.taxa = taxa;
    }

    @Override
    protected double calculaTotal() {
        return super.getValor() * cambio + taxa;
    }
    
}
