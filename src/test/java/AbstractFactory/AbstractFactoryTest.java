package AbstractFactory;

import org.example.AbstractFactory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest {

    @Test
    void testPagamentoCartao() {
        MetodoPagamento pagamento = new PagamentoCartao();
        String resultado = pagamento.pagar(100.0);
        assertEquals("Pagamento de 100.0 realizado com Cartão.", resultado);
    }

    @Test
    void testPagamentoBoleto() {
        PagamentoBoleto pagamento = new PagamentoBoleto();
        String resultado = pagamento.pagar(200.0);
        assertEquals("Pagamento de 200.0 realizado com Boleto.", resultado);
    }

    @Test
    void testCartaoFactory() {
        PagamentoFactory factory = new CartaoFactory();
        MetodoPagamento pagamento = factory.criarPagamento();
        assertTrue(pagamento instanceof PagamentoCartao);
    }

    @Test
    void testBoletoFactory() {
        PagamentoFactory factory = new BoletoFactory();
        MetodoPagamento pagamento = factory.criarPagamento();
        assertTrue(pagamento instanceof PagamentoBoleto);
    }
}