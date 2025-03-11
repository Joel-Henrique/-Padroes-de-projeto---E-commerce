package org.example.ChainofResponsibility;

import org.example.FactoryMethod.Pedido;

abstract class VerificacaoPedido {
    protected VerificacaoPedido proximo;

    public void setProximo(VerificacaoPedido proximo) {
        this.proximo = proximo;
    }

    public String verificar(Pedido pedido) {
        if (proximo != null) {
            proximo.verificar(pedido);
        }
        return null;
    }
}
