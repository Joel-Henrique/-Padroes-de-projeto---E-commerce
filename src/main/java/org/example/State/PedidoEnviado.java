package org.example.State;

public class PedidoEnviado implements EstadoPedido {
    public String avancar(PedidoContexto contexto) {
        contexto.setEstado(new PedidoEntregue());
        return("Pedido foi enviado para entrega.");
    }
}