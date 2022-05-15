/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_arreglos_3_objetos;

import java.util.Scanner;

/**
 *
 * @author AngieFr
 */
public class EVA2_13_ARREGLOS_3_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Persona[] arreglosPer = new Persona[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            //crear el objeto:
            arreglosPer[i] = new Persona();
            System.out.println("¿Cual es tu nombre? ");
            arreglosPer[i].setNombre(input.nextLine());
        }
        
        //MOSTRAR DATOS:
        for(int i = 0; i < 10; i++){
            System.out.println("Nombre: " + arreglosPer[i].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    }
