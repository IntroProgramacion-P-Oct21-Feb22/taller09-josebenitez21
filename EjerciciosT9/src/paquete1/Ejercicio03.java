/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int elementosArribaMedia=0;
        int elementosAbajoMedia=0;
        double sumaMedia = 0;

        for (int i = 0; i < arreglo.length; i++) {
            sumaMedia = sumaMedia + arreglo[i];

        }
        
        sumaMedia= sumaMedia/arreglo.length;
//        System.out.printf("%.2f",sumaMedia);
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > sumaMedia) {
    
                elementosArribaMedia = elementosArribaMedia +1;
           }else{
            elementosAbajoMedia =  elementosAbajoMedia +1;
            }
        }
       
        System.out.printf("Los elementos ariba de la media son: %d ,y "+ "Los"
                + " elementos abajo de la media son: %d ",elementosArribaMedia,
                elementosAbajoMedia);
    }

}

