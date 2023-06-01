package es.iesmz.ed.algoritmes;


public class SumaDescendent {


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
