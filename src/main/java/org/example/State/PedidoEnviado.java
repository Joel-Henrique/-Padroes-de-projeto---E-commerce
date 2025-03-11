package org.example.State;

class PedidoEnviado implements EstadoPedido {
    public String avancar(PedidoContexto contexto) {
        contexto.setEstado(new PedidoEntregue());
        return("Pedido foi enviado para entrega.");
    }
}