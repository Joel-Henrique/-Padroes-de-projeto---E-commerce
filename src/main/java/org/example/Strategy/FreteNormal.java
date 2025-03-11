package org.example.Strategy;

public class FreteNormal implements FreteStrategy {
    public double calcularFrete(double peso) {
        return peso * 5.0;
    }
}