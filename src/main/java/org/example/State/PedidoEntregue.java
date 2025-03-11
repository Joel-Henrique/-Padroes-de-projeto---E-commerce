package org.example.State;

public class PedidoEntregue implements EstadoPedido {
    public String avancar(PedidoContexto contexto) {
        return("Pedido já foi entregue.");
    }
}