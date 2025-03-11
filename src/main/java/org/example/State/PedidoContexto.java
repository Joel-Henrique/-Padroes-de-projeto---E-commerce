package org.example.State;

public class PedidoContexto {
    private EstadoPedido estado;

    public PedidoContexto() {
        this.estado = new PedidoRecebido();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void avancarEstado() {
        estado.avancar(this);
    }

    public EstadoPedido getEstado() {
        return this.estado;
    }
}