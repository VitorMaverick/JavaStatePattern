package descontoExtra.situacao;

import descontoExtra.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends AbstractSituacao{
    public BigDecimal calculaDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    void aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }
}
