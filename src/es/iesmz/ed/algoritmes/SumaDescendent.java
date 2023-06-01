package es.iesmz.ed.algoritmes;

/**
 * Esta clase realiza la suma de los numeros por los cual esta formado un numero quitandole en cada suma el valor de la posicion mas alta de un numero.
 * @author: Saleem Siddique
 * @version: 01/06/2023
 */
public class SumaDescendent {

    /**
     * Voy realizando el substring para ir menguando el numero
     * @param numero El parámetro define el número del que tendremos que empezar la suma.
     */
    public static int calcularSumaDescendente(int numero) {
        String numS = String.valueOf(numero);
        int suma = 0;
        for (int i = 0; i < numS.length(); i++) {
            String substr = numS.substring(i);
            int numeroSubstr = Integer.parseInt(substr);
            suma += numeroSubstr;
        }
        return suma;
    }
}
