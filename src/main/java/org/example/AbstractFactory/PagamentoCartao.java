package org.example.AbstractFactory;

class PagamentoCartao implements MetodoPagamento {
    public String pagar(double valor) {
        return ("Pagamento de " + valor + " realizado com Cartão.");
    }
}