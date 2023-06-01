package es.iesmz.ed.algoritmes;

import java.util.List;
/**
 * Esta clase realiza la comprobacion de si se puede realizar un circulo completamente cerrado con los extremos de cables.
 * @author: Saleem Siddique
 * @version: 01/06/2023
 */
public class ConectarCables {

    /**
     * Comprueba si hay los mimos extremos machos que hembras.
     * @param cables El parámetro define todos los cables que tenemos en una situacion.
     */
    public static boolean esPotConnectar(String[] cables) {
        int maleCount = 0;
        int femaleCount = 0;

        // Contar la cantidad de conectores M y H
        for (String cable : cables) {
            if (cable.equals("MM")) {
                maleCount++;
            } else if (cable.equals("HH")) {
                femaleCount++;
            }
        }

        // Verificar si las cantidades son iguales
        return maleCount == femaleCount;
    }
}
