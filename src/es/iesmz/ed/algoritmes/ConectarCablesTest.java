package es.iesmz.ed.algoritmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConectarCablesTest {

    @Test
    void esPotConnectar() {
        String[] cables = {"HM"};
        boolean resultadoEsperado = true;
        boolean resultadoReal = ConectarCables.esPotConnectar(cables);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esPotConnectar1() {
        String[] cables = {"HH"};
        boolean resultadoEsperado = false;
        boolean resultadoReal = ConectarCables.esPotConnectar(cables);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esPotConnectar2() {
        String[] cables = {"HM", "MH"};
        boolean resultadoEsperado = true;
        boolean resultadoReal = ConectarCables.esPotConnectar(cables);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esPotConnectar3() {
        String[] cables = {"HM", "HH", "MM"};
        boolean resultadoEsperado = true;
        boolean resultadoReal = ConectarCables.esPotConnectar(cables);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void esPotConnectar4() {
        String[] cables = {"HM", "HH", "MM", "MM"};
        boolean resultadoEsperado = false;
        boolean resultadoReal = ConectarCables.esPotConnectar(cables);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}