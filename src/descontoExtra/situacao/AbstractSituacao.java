package descontoExtra.situacao;

import descontoExtra.Orcamento;

import java.math.BigDecimal;

public abstract class AbstractSituacao {

    public BigDecimal calculaDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    void aprovar(Orcamento orcamento) {
        throw new RuntimeException();
    }

    void reprovar(Orcamento orcamento) {
        throw new RuntimeException();
    }

    void finalizar(Orcamento orcamento) {
        throw new RuntimeException();
    }


}
