/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_arreglos2;

import java.util.Scanner;

/**
 *
 * @author AngieFr
 */
public class EVA2_12_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arreglosEdad = new int[32];//bytes ocupa un entero --> 4bytes
        Scanner input = new Scanner(System.in);
        //32 capturas --> for
        //CAPTURA DE DATOS
        for(int i = 0; i < 32; i++){//i --> index --> indic
            System.out.println("¿Cual es tu edad?");
            arreglosEdad[i] = input.nextInt();
        }
        
        //Mostrar Datos
        for(int i = 0; i < 32; i++){
            System.out.println("[" + arreglosEdad[i] + "]");
        }
        
    }
}