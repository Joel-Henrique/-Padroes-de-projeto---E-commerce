package org.example.iterator;

import java.util.Iterator;
import java.util.List;

public class ListaDeProdutos implements ColecaoProduto {
    private List<Produto> produtos;

    public ListaDeProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public Iterator<Produto> criarIterator() {
        return new ProdutoIterator(produtos);
    }
}