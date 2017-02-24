/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculoapp;

/**
 *
 * @author utp
 */
public class Vehiculoapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro vehiculo =new Carro();
        vehiculo.setPlaca("RQR59D");
        vehiculo.setColor("Negro");
        vehiculo.setModelo("2016_KZ_Z250");
        vehiculo.setNumerosoat("589365225");
        System.out.println("Placa :"+vehiculo.getPlaca()+"  color : "+vehiculo.getColor()+"  modelo :"+vehiculo.getModelo()+"  numero de soat :"+vehiculo.getNumerosoat());
        
        
        
        // TODO code application logic here
    }
    
}
