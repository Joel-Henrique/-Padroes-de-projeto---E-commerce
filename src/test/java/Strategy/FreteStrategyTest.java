
package Strategy;

import org.example.Strategy.FreteExpresso;
import org.example.Strategy.FreteNormal;
import org.example.Strategy.FreteStrategy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FreteStrategyTest {

    @Test
    void deveCalcularFreteNormalCorretamente() {
        FreteStrategy frete = new FreteNormal();
        double resultado = frete.calcularFrete(10.0); // Peso = 10kg
        assertEquals(50.0, resultado, "Frete normal deve ser peso * 5.0");
    }

    @Test
    void deveCalcularFreteExpressoCorretamente() {
        FreteStrategy frete = new FreteExpresso();
        double resultado = frete.calcularFrete(10.0); // Peso = 10kg
        assertEquals(120.0, resultado, "Frete expresso deve ser peso * 10.0");
    }

    @Test
    void deveRetornarZeroParaFreteComPesoZero() {
        FreteStrategy freteNormal = new FreteNormal();
        FreteStrategy freteExpresso = new FreteExpresso();

        assertEquals(0.0, freteNormal.calcularFrete(0.0), "Frete normal para peso zero deve ser 0.0");
        assertEquals(0.0, freteExpresso.calcularFrete(0.0), "Frete expresso para peso zero deve ser 0.0");
    }

    @Test
    void deveCalcularFreteParaValoresDiferentes() {
        FreteStrategy freteNormal = new FreteNormal();
        FreteStrategy freteExpresso = new FreteExpresso();

        assertEquals(25.0, freteNormal.calcularFrete(5.0), "Frete normal para 5kg deve ser 25.0");
        assertEquals(90.0, freteExpresso.calcularFrete(7.5), "Frete expresso para 7.5kg deve ser 90.0");
    }
}
