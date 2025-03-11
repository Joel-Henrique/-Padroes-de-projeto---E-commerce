package org.example.iterator;

import java.util.Iterator;
import java.util.List;

class ProdutoIterator implements Iterator<Produto> {
    private List<Produto> produtos;
    private int posicao = 0;

    public ProdutoIterator(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean hasNext() {
        return posicao < produtos.size();
    }

    @Override
    public Produto next() {
        return produtos.get(posicao++);
    }
}
