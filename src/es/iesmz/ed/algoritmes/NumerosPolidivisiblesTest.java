package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosPolidivisiblesTest {

    @Test
    void isPolidivisible() {
        boolean resultadoEsperado = true;
        boolean resultadoReal = NumerosPolidivisibles.isPolidivisible(381654729);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void isPolidivisible1() {
        boolean resultadoEsperado = true;
        boolean resultadoReal = NumerosPolidivisibles.isPolidivisible(102);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void isPolidivisible2() {
        boolean resultadoEsperado = false;
        boolean resultadoReal = NumerosPolidivisibles.isPolidivisible(39);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void isPolidivisible3() {
        boolean resultadoEsperado = true;
        boolean resultadoReal = NumerosPolidivisibles.isPolidivisible(9876);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void isPolidivisible4() {
        boolean resultadoEsperado = false;
        boolean resultadoReal = NumerosPolidivisibles.isPolidivisible(00023);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}