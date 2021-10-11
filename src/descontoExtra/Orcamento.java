package descontoExtra;

import descontoExtra.situacao.AbstractSituacao;
import descontoExtra.situacao.EmAnalise;

import java.math.BigDecimal;

public class Orcamento {
    BigDecimal valor;
    int qtdItens;
    AbstractSituacao situacao;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
        this.situacao = new EmAnalise();
    }

    public void setSituacao(AbstractSituacao situacao) {
        this.situacao = situacao;
    }

    public void aplicaDescontoExtra() {
        BigDecimal valor = this.situacao.calculaDescontoExtra(this);
        this.valor = this.valor.subtract(valor);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }
}
