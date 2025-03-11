package org.example.AbstractFactory;

class CartaoFactory implements PagamentoFactory {
    public MetodoPagamento criarPagamento() {
        return new PagamentoCartao();
    }
}