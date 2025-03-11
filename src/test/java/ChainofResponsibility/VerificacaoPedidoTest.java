package ChainofResponsibility;

import org.example.ChainofResponsibility.VerificacaoPedido;
import org.example.ChainofResponsibility.VerificarCarrinho;
import org.example.ChainofResponsibility.VerificarEstoque;
import org.example.ChainofResponsibility.VerificarPagamento;
import org.example.FactoryMethod.*;
import org.example.Singleton.CarrinhoDeCompras;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VerificacaoPedidoTest {
    private VerificacaoPedido verificacao;
    private CarrinhoDeCompras carrinho;

    @BeforeEach
    void setUp() {
        carrinho = CarrinhoDeCompras.getInstance();
        verificacao = new VerificarCarrinho();
        VerificacaoPedido estoque = new VerificarEstoque();
        VerificacaoPedido pagamento = new VerificarPagamento();

        verificacao.setProximo(estoque);
        estoque.setProximo(pagamento);
    }

    @Test
    void testVerificarCarrinhoVazio() {
        carrinho.limpar();
        Pedido pedido = new PedidoNormal(100.0);
        assertEquals("Erro: Carrinho de compras vazio!", verificacao.verificar(pedido));
    }

    @Test
    void testVerificarCarrinhoComItens() {
        carrinho.adicionarItem("Produto 1");
        Pedido pedido = new PedidoNormal(100.0);
        assertEquals("Carrinho verificado com sucesso.", verificacao.verificar(pedido));
    }


    @Test
    void testVerificarFluxoCompleto() {
        carrinho.adicionarItem("Produto 1");
        Pedido pedido = new PedidoNormal(100.0);
        assertEquals("Carrinho verificado com sucesso.", verificacao.verificar(pedido));
    }
}