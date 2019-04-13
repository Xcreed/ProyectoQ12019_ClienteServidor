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
    
    public String sumar (){
        Fraccion resultado = new Fraccion("1/1");
        
        if (super.getDenominador() == fraccion2.getDenominador()) {
            resultado.setNumerador(super.getNumerador() + fraccion2.getNumerador());
            resultado.setDenominador(super.getDenominador());
        } else {
            resultado.setNumerador((super.getNumerador()*fraccion2.getDenominador())+(super.getDenominador()*fraccion2.getNumerador()));
            resultado.setDenominador(super.getDenominador()*fraccion2.getDenominador());
        }
        
        return simplificar(resultado.getNumerador(),resultado.getDenominador());
    } 
    
    public String restar () {
        Fraccion resultado = new Fraccion("1/1");
        
        if (super.getDenominador() == fraccion2.getDenominador()) {
            resultado.setNumerador(super.getNumerador() - fraccion2.getNumerador());
            resultado.setDenominador(super.getDenominador());
        } else {
            resultado.setNumerador((super.getNumerador()*fraccion2.getDenominador())-(super.getDenominador()*fraccion2.getNumerador()));
            resultado.setDenominador(super.getDenominador()*fraccion2.getDenominador());
        }
        
        return simplificar(resultado.getNumerador(),resultado.getDenominador());    
    }
    
    public String multiplicar () {
        Fraccion resultado = new Fraccion("1/1");
        
        resultado.setNumerador(super.getNumerador() * fraccion2.getNumerador());
        resultado.setDenominador(super.getDenominador() * fraccion2.getDenominador());
        
        return simplificar(resultado.getNumerador(),resultado.getDenominador());    
    }
    
    public String dividir () {
        Fraccion resultado = new Fraccion("1/1");
        
        resultado.setNumerador(super.getNumerador() * fraccion2.getDenominador());
        resultado.setDenominador(super.getDenominador() * fraccion2.getNumerador());
        
        return simplificar(resultado.getNumerador(),resultado.getDenominador());  
    }
    
    public int mcd (int numerador, int denominador) {
        if (numerador % denominador == 0) {
            return denominador;
        } else {
          return mcd(denominador, numerador % denominador);  
        }
    }
    
    public String simplificar (int numerador, int denominador) {
        int divisor = mcd(numerador,denominador);
        Fraccion resultado = new Fraccion("1/1");
        
        resultado.setNumerador(numerador/divisor);
        resultado.setDenominador(denominador/divisor);
        
        return resultado.toString();
    }
}
