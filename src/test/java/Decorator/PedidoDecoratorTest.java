package Decorator;

import org.example.Decorator.DescontoPedido;
import org.example.FactoryMethod.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoDecoratorTest {

    @Test
    void testPedidoComDesconto() {
        Pedido pedido = new PedidoNormal(100.0);
        Pedido pedidoComDesconto = new DescontoPedido(pedido, 20.0);
        assertNotNull(pedidoComDesconto);
        assertEquals("Pedido com desconto processado. Novo valor: 80.0", pedidoComDesconto.processar());
    }

    @Test
    void testPedidoComDescontoMaiorQueValor() {
        Pedido pedido = new PedidoNormal(50.0);
        Pedido pedidoComDesconto = new DescontoPedido(pedido, 60.0);
        assertNotNull(pedidoComDesconto);
        assertEquals("Pedido com desconto processado. Novo valor: -10.0", pedidoComDesconto.processar());
    }

    @Test
    void testPedidoComDescontoZero() {
        Pedido pedido = new PedidoExpresso(150.0);
        Pedido pedidoComDesconto = new DescontoPedido(pedido, 0.0);
        assertNotNull(pedidoComDesconto);
        assertEquals("Pedido com desconto processado. Novo valor: 150.0", pedidoComDesconto.processar());
    }
}
