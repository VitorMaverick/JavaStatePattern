package descontoExtra.situacao;

import descontoExtra.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends AbstractSituacao {

    @Override
    void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
