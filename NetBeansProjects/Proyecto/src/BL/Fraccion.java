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
        this("1/1"); //Agregar errores para si es vac[io
        
    }
    
    public Fraccion(String fraccion) {
        int numerador = 0; //Borrar esto, no se le va a permitir al usuario ingresar datos invalidos. (Mover error handling al gui)
        int denominador = 0;
        
        while(numerador == 0 || denominador == 0) {
            try{
                numerador = Integer.parseInt(fraccion.split("/")[0]);
                denominador = Integer.parseInt(fraccion.split("/")[1]);
            } 
            catch (NumberFormatException nfe) { //Fraccion no tiene numerador
                numerador = 1;
                denominador = Integer.parseInt(fraccion.split("/")[1]);
            } 
            catch (ArrayIndexOutOfBoundsException aioe) {  
                if (aioe.getMessage().equalsIgnoreCase("1")){ //Fraccion no denominador
                    numerador = Integer.parseInt(fraccion.split("/")[0]);
                    denominador = 1;
                } 
                else { //Fraccion no tiene valores
                    numerador = 1;
                    denominador = 1;
                    
                }

            } catch (Exception ex) {
                numerador = 1;
                denominador = 1;
            }
        }
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
