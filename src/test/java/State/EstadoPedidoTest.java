package State;
import org.example.State.PedidoContexto;
import org.example.State.PedidoEntregue;
import org.example.State.PedidoEnviado;
import org.example.State.PedidoRecebido;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EstadoPedidoTest {
    private PedidoContexto pedido;

    @BeforeEach
    void setUp() {
        pedido = new PedidoContexto();
    }

    @Test
    void deveIniciarComEstadoPedidoRecebido() {
        assertInstanceOf(PedidoRecebido.class, pedido.getEstado(), "O pedido deve iniciar no estado 'Recebido'");
    }

    @Test
    void deveAvancarParaPedidoEnviado() {
        pedido.avancarEstado();
        assertInstanceOf(PedidoEnviado.class, pedido.getEstado(), "O pedido deve avançar para 'Enviado'");
    }

    @Test
    void deveAvancarParaPedidoEntregue() {
        pedido.avancarEstado();
        pedido.avancarEstado();
        assertInstanceOf(PedidoEntregue.class, pedido.getEstado(), "O pedido deve avançar para 'Entregue'");
    }

    @Test
    void naoDeveAvancarAposPedidoEntregue() {
        pedido.avancarEstado();
        pedido.avancarEstado();
        pedido.avancarEstado();

        assertInstanceOf(PedidoEntregue.class, pedido.getEstado(), "O pedido deve permanecer em 'Entregue'");
    }
}
