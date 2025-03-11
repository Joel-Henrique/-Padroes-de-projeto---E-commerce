package org.example.ChainofResponsibility;

import org.example.FactoryMethod.Pedido;

class VerificarEstoque extends VerificacaoPedido {
    public String verificar(Pedido pedido) {
        super.verificar(pedido);
        return ("Estoque verificado com sucesso.");
    }
}