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
public class Problema00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
    /* la salida de este codigo va a ser 17, ya que este codigo tiene un
arreglo de tipo entero llamado datos, tambien tiene declarada una funcion de 
tipo entera llamada misterio con dos parametros. En la funcion principal 
ase un llamamiento de la funcion misterio y esta se encargara de sumar todos 
los valores del arreglo y asi mismo esta el valor de la suma ala funcion 
principal  de la cual se presentara en pantalla todos los valores sumados */
    

