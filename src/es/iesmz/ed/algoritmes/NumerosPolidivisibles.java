package es.iesmz.ed.algoritmes;

/**
 * Esta clase comprueba si un numero pasado por parametro es un numero polidivisible.
 * @author: Saleem Siddique.
 * @version: 01/06/2023
 */

public class NumerosPolidivisibles {

    /**
     * Comprueba los modulos de cada numero que tenemos que dividir para comprobar si es polidivisible.
     * @param numero El numero que comprobamos si es polidivisible.
     */
    public static boolean isPolidivisible(long numero) {
        String numS = Long.toString(numero);
        for (int i = numS.length(); i >= 1; i--) {
            long subNumber = Long.parseLong(numS.substring(0, i));
            if (subNumber % i != 0) {
                return false;
            }
        }
        return true;
    }
}
