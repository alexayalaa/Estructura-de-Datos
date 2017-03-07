/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos.alexander.niño;

/**
 *
 * @author Usuario1
 */
public class ESTRUCTURADEDATOSALEXANDERNIÑO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona m=new Persona();
        m.setNombre("toshiro");
        System.out.println(m.getNombre());
        
        vector x = new vector();
        x.setTamaño(3);
        x.crearVector();
        x.insertarDato(5,1);
        x.buscarDato(3);
       
        
    }
    
}
