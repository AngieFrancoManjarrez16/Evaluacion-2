/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_herencia_vehículos;

/**
 *
 * @author AngieFrMa
 */
public class EVA2_4_HERENCIA_VEHÍCULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Vehículo{
    private String Conbustible;
    private int Llantas;
    private double Motor;
    private int Pasajeros;
    private String Marca;
    private String Modelo;
    private int Año;
    
public Vehículo(){
    Conbustible = "";
    Llantas = 0;
    Motor = 0.0;
    Pasajeros = 0;
    Marca = "";
    Modelo = "";
    Año = 0;
    
    }

    public Vehículo(String Conbustible, int Llantas, double Motor, int Pasajeros, String Marca, String Modelo, int Año) {
        this.Conbustible = Conbustible;
        this.Llantas = Llantas;
        this.Motor = Motor;
        this.Pasajeros = Pasajeros;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Año = Año;
    }
    
    public void imprimirDatos(){
        System.out.println("Tipo de Conbustible: " + Conbustible);
        System.out.println("Numero de Llantas: " + Llantas);
        System.out.println("Capacidad del Motor: " + Motor);
        System.out.println("Numero de Pasajeros Permitido: " + Pasajeros);
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: "+ Modelo);
        System.out.println("AÃ±o: " + Año );
        
    }
    
}