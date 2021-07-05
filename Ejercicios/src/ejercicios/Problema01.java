/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
          for (int fil = 0; fil< datos.length; fil++) {
            for (int col = 0; col< datos[fil].length; col++) {
                resultado[fil][col] = posicionFactorial(datos[fil][col]);
                System.out.println(resultado[fil][col]);
            }
        }
    }

        public static double posicionFactorial(double numero) {
            if (numero <= 1) {
                return 1;
            } else {
                return numero * posicionFactorial(numero - 1);
        }
    }
    
}
