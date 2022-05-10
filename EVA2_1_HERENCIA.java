/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_herencia;

/**
 *
 * @author AngieFrMa
 */
public class EVA2_1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        //perso1
        Estudiante estu1 = new Estudiante();
        estu1.setNombre("Juana");
        estu1.setEdad(22);
        estu1.setNumeroControl("21550845");
        estu1.imprimirdatos();
        System.out.println("No de Control: " + estu1.getNumeroControl());
    }
    
}


//subclase
class Estudiante extends Persona {
    private String numeroControl;
    
    //constructor default:
    public Estudiante(){
        super();//llamada al constructor de la superclase
        System.out.println("Clase estudiante");
        
    }    

public Estudiante (String ){
    
    
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
} 


class Persona{//super clase
    private String nombre;
    private int edad;

    public Persona(){
        this.nombre = "";
        this.edad = 0; 
    }
    
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad; 
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   public void imprimirdatos(){
       System.out.println("Nombre: " + nombre);
       System.out.println("Edad: " + edad);
   }
}
