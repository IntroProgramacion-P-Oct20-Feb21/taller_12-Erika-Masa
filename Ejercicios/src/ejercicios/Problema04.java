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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double base;
        double potencia;
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        String cadenaFinal = " ";
        
        for (int i = 0; i < 5 ; i++) {
               base = bases[i];
            potencia = potencias[i];
            resultado[i] = obtenerPotencia(bases[i], potencias[i]);
            cadenaFinal = String.format("%sEl resultado de la potencia: %.2f\n",cadenaFinal, resultado[i]);
        }
        
        cadenaFinal = String.format("%s La suma de todas las potencias es : \n%.2f\n",
                cadenaFinal, obtenerSuma(resultado));
        System.out.printf("%s", cadenaFinal);
    
        
    }

    public static double obtenerPotencia(double base, double potencia) {

        if (potencia == 1) {
            return base;
        } else {
            return base * obtenerPotencia(base, potencia - 1);
        }
    }
     public static double obtenerSuma(double[] arreglo) {
        double suma = 0;
        for (int i = 0; i < 5; i++){
            suma = suma + arreglo[i];
        }
        return suma;
    }

}



    
    
    
    
