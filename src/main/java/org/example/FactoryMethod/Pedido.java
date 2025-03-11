package org.example.FactoryMethod;

public abstract class Pedido {
    public double valor;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public abstract String processar();
}