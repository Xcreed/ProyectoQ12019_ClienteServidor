/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
<<<<<<< HEAD
 * @author damar
 */

public class Operacion extends Fraccion {
    
    private Fraccion fraccion2;
    
    public Operacion(){
        
    }
    
    public Operacion(String fraccion1, String fraccion2) {
        super(fraccion1);
        this.fraccion2 = new Fraccion(fraccion2);
        
    }
}
