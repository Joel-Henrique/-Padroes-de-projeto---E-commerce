package org.example.Strategy;

public class FreteExpresso implements FreteStrategy{
    public double calcularFrete(double peso) {
        return peso * 12.0;
    }
}