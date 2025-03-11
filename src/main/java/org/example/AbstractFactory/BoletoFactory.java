package org.example.AbstractFactory;

class BoletoFactory implements PagamentoFactory {
    public MetodoPagamento criarPagamento() {
            return new PagamentoCartao();
    }
}