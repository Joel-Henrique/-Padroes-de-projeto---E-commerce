package Iterator;

import org.example.iterator.ListaDeProdutos;
import org.example.iterator.Produto;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoIteratorTest {
    @Test
    void testIteratorPercorreTodosOsProdutos() {
        List<Produto> produtos = List.of(
                new Produto("Laptop", 3500.00),
                new Produto("Smartphone", 2000.00),
                new Produto("Fone de Ouvido", 150.00)
        );

        ListaDeProdutos listaDeProdutos = new ListaDeProdutos(produtos);
        Iterator<Produto> iterator = listaDeProdutos.criarIterator();

        assertTrue(iterator.hasNext());
        assertEquals("Laptop", iterator.next().getNome());
        assertTrue(iterator.hasNext());
        assertEquals("Smartphone", iterator.next().getNome());
        assertTrue(iterator.hasNext());
        assertEquals("Fone de Ouvido", iterator.next().getNome());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testIteratorListaVazia() {
        List<Produto> produtos = List.of();
        ListaDeProdutos listaDeProdutos = new ListaDeProdutos(produtos);
        Iterator<Produto> iterator = listaDeProdutos.criarIterator();

        assertFalse(iterator.hasNext());
    }
}
