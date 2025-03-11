package org.example.ChainofResponsibility;

import org.example.FactoryMethod.Pedido;
import org.example.Singleton.CarrinhoDeCompras;

class VerificarCarrinho extends VerificacaoPedido {
    public String verificar(Pedido pedido) {
        if (CarrinhoDeCompras.getInstance().getItens().isEmpty()) {
            return ("Erro: Carrinho de compras vazio!");
        }
        super.verificar(pedido);
        return("Carrinho verificado com sucesso.");
    }
}