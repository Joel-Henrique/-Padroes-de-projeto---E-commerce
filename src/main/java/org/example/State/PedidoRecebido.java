package org.example.State;

public class PedidoRecebido implements EstadoPedido {
    public String avancar(PedidoContexto contexto) {
        contexto.setEstado(new PedidoEnviado());
        return ("Pedido foi processado e está em preparação.");
    }
}
