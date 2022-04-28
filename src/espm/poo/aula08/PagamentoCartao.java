package espm.poo.aula08;

public class PagamentoCartao extends Pagamento {

    private final double comissao;

    public PagamentoCartao(double valor, double comissao) {
        super(valor);
        this.comissao = comissao;
    }

    @Override
    protected double calculaTotal() {
        return super.getValor() + comissao;
    }
    
}
