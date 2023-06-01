package es.iesmz.ed.algoritmes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaDescendentTest {

    @Test
    void calcularSumaDescendente() {
        int resultadoReal = SumaDescendent.calcularSumaDescendente(111);
        int resultadoEsperado = 123;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void calcularSumaDescendente1() {
        int resultadoReal = SumaDescendent.calcularSumaDescendente(4578);
        int resultadoEsperado = 5242;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void calcularSumaDescendente2() {
        int resultadoReal = SumaDescendent.calcularSumaDescendente(10000002);
        int resultadoEsperado = 10000016;
        assertEquals(resultadoEsperado, resultadoReal);
    }
}