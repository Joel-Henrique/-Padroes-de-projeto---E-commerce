package org.example.FactoryMethod;

class PedidoNormal extends Pedido {
    public PedidoNormal(double valor) {
        super(valor);
    }
    public String processar() {
        return("Pedido Normal processado. Valor: " + valor);
    }
}