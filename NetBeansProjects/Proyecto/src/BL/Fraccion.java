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
        this("1/1");
        
    }
    
    public Fraccion(String fraccion) {
        
        int numerador = Integer.parseInt(fraccion.split("/")[0]);
        int denominador = Integer.parseInt(fraccion.split("/")[1]);
        
        setNumerador(numerador);
        setDenominador(denominador);
        
    }

    public void setNumerador(int numerador) {
        if (numerador == 0) {
            this.numerador = 1;
        } else{
            this.numerador = numerador;
        }
        
    }

    public void setDenominador(int denominador) {
        if(denominador == 0) {
            this.denominador = 1;
        } else{
            this.denominador = denominador;
        }
        
    }
    
    public int getNumerador(){
        return this.numerador;
    }
    
    public int getDenominador(){
        return this.denominador;
    }
    
    public String toString(){
        
        return getNumerador() + "/" + getDenominador();
    }
    
    
    
    
}
