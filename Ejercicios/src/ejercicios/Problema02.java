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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
       
            sumaDatos(datos, 0);
    }

    public static void sumaDatos (double[][] datos, int fil) {
       
        double suma = datos[fil][0] + datos[fil][1] + datos[fil][2];
        System.out.println(suma);
        fil = fil + 1;
        if (fil < datos.length) {
            sumaDatos(datos, fil);
        }

    }

}

        
        
    
