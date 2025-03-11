package org.example.AbstractFactory;

public class PagamentoBoleto implements MetodoPagamento {
    public String pagar(double valor) {
        return ("Pagamento de " + valor + " realizado com Boleto.");
    }
}
