package org.example.Decorator;
import org.example.FactoryMethod.Pedido;
class DescontoPedido extends PedidoDecorator {
    private double desconto;

    public DescontoPedido(Pedido pedido, double desconto) {
        super(pedido);
        this.desconto = desconto;
    }

    public String processar() {
        double novoValor = pedidoDecorado.valor - desconto;
        return ("Pedido com desconto processado. Novo valor: " + novoValor);
    }
}
