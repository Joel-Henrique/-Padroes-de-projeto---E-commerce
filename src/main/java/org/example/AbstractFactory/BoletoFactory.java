package org.example.AbstractFactory;

public class BoletoFactory implements PagamentoFactory {
    public MetodoPagamento criarPagamento() {
        return new PagamentoBoleto();
    }
}