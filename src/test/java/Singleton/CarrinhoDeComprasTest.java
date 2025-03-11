package Singleton;

import org.example.Singleton.CarrinhoDeCompras;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
class CarrinhoDeComprasTest {
    private CarrinhoDeCompras carrinho;

    @BeforeEach
    void setUp() {
        carrinho = CarrinhoDeCompras.getInstance();
        carrinho.getItens().clear();
    }

    @Test
    void deveRetornarMesmaInstanciaSingleton() {
        CarrinhoDeCompras outroCarrinho = CarrinhoDeCompras.getInstance();
        assertSame(carrinho, outroCarrinho, "Carrinho deve ser a mesma instância Singleton");
    }

    @Test
    void deveAdicionarItemNoCarrinho() {
        String resultado = carrinho.adicionarItem("Notebook");
        assertTrue(carrinho.getItens().contains("Notebook"));
        assertEquals("Item adicionado ao carrinho: Notebook", resultado);
    }

    @Test
    void deveRemoverItemDoCarrinho() {
        carrinho.adicionarItem("Mouse");
        String resultado = carrinho.removerItem("Mouse");
        assertFalse(carrinho.getItens().contains("Mouse"));
        assertEquals("Item removido do carrinho: Mouse", resultado);
    }

    @Test
    void deveListarItensDoCarrinho() {
        carrinho.adicionarItem("Teclado");
        carrinho.adicionarItem("Monitor");

        String resultado = carrinho.listarItens();
        assertEquals("Itens no carrinho: [Teclado, Monitor]", resultado);
    }

    @Test
    void deveRetornarListaVaziaSeNenhumItemForAdicionado() {
        String resultado = carrinho.listarItens();
        assertEquals("Itens no carrinho: []", resultado);
    }
}
