package org.example.ChainofResponsibility;

import org.example.FactoryMethod.Pedido;

public class VerificarEstoque extends VerificacaoPedido {
    public String verificar(Pedido pedido) {
        super.verificar(pedido);
        return ("Estoque verificado com sucesso.");
    }
}