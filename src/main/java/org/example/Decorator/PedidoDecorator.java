package org.example.Decorator;

import org.example.FactoryMethod.Pedido;

abstract class PedidoDecorator extends Pedido {
    protected Pedido pedidoDecorado;

    public PedidoDecorator(Pedido pedido) {
        super(pedido.valor);
        this.pedidoDecorado = pedido;
    }

    public abstract String processar();
}