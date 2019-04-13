/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

/**
 *
 * @author creed
 */
public class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion() { 
        
    }
    
    public Fraccion(String fraccion) {
        
        int numerador = Integer.parseInt(fraccion.split("/")[0]);
        int denominador = Integer.parseInt(fraccion.split("/")[1]);
        
        setNumerador(numerador);
        setDenominador(denominador);
        
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public int getNumerador(){
        return this.numerador;
    }
    
    public int getDenominador(){
        return this.denominador;
    }
    
    public String toString(){
        
        return "Valor de fracci\u00f3n es: " + getNumerador() + "/" + getDenominador();
    }
    
    
    
    
}
