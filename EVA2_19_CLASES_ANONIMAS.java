/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_clases_anonimas;

/**
 *
 * @author AngieFr
 */
public class EVA2_19_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensajes mensajes = new Mensajes(){//clase anonima
            @Override
            public void mostrarMensajes() {
                System.out.println("Hola Mundo!");
            }
            
        };
        mensajes.mostrarMensajes();
    }
    
}

interface Mensajes{
    public void mostrarMensajes();
}
