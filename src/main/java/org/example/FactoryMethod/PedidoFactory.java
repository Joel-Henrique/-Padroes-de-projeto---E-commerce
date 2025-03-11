package org.example.FactoryMethod;

public class PedidoFactory {
    public static Pedido criarPedido(String tipo, double valor) {
        if (tipo.equals("normal")) return new PedidoNormal(valor);
        else if (tipo.equals("expresso")) return new PedidoExpresso(valor);
        throw new IllegalArgumentException("Tipo de pedido desconhecido");
    }
}