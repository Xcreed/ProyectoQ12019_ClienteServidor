/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.Fraccion;
import BL.Operacion;

/**
 *
 * @author creed
 */
public class main {
    
    public static void main(String[] args) throws Exception{
        
        //Operacion fraccion1 = new Operacion("3/","3/2");
        Fraccion fraccion1 = new Fraccion("12/3");
        
        System.out.println(fraccion1.toString());
        
    }
    
}
