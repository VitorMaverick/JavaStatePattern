package descontoExtra.situacao;

import descontoExtra.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends AbstractSituacao {
    @Override
    public BigDecimal calculaDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    void finalizar(Orcamento orcamento) {
        super.finalizar(orcamento);
    }
}
