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

    /**
     * Constructor con valores por omisión
     * @throws Exception cuando el formato no es el correcto
     */
    public Fraccion() throws Exception { 
        this("1/1"); //Agregar errores para si es vac[io
        
    }
    
    /**
     * Constructor con valores correctos para construir la fracción
     * @throws Exception cuando el formato no es el correcto
     */
    public Fraccion(String fraccion) throws Exception {
        
        int numerador = 0;
        int denominador = 0;
        
        //while(numerador == 0 || denominador == 0) {
            try{
                numerador = Integer.parseInt(fraccion.split("/")[0]);
                denominador = Integer.parseInt(fraccion.split("/")[1]);
            } 
            
            catch (NumberFormatException nfe) { //Fraccion no tiene numerador o tiene letras
                throw new Exception("La fracci\u00f3n no posee el formato correcto. Verifique y vuelva a intentar.");
            } 
            
            catch (ArrayIndexOutOfBoundsException aioe) {  
                if (aioe.getMessage().equalsIgnoreCase("1")){ //Fraccion no tiene denominador
                    denominador = 1;
                    //throw new Exception("La fracci\u00f3n no contiene denominador. Se le agregar\u00e1 un 1 por ser un n\u00famero entero.");
                } 
                
            } catch (Exception ex) {
                throw new Exception("Error en la fracci\u00f3n. Verifique y vuelva a intentar.");
            }
        //}
        
        setNumerador(numerador);
        setDenominador(denominador);
        
    }

    /**
     * Asigna el valor de numerador al numerador de la fracción
     * @param numerador de la fracción
     * @throws Exception cuando el numerador es 0
     */
    public void setNumerador(int numerador) throws Exception{
        if (numerador == 0) {
            throw new Exception ("El numerador no puede ser 0.");
        } else{
            this.numerador = numerador;
        }
        
    }

    /**
     * Asigna el valor de denominador al denominador de la fracción
     * @param denominador de la fracción
     * @throws Exception cuando el denominador es 0
     */
    public void setDenominador(int denominador) throws Exception {
        if(denominador == 0) {
            throw new Exception ("El denominador no puede ser 0.");
        } else{
            this.denominador = denominador;
        }
        
    }
    
    /**
     * Obtiene el numerador de la fracción
     * @return numerador de la fracción
     */
    public int getNumerador(){
        return this.numerador;
    }
    
    /**
     * Obtiene el denominador de la fracción
     * @return denominador de la fracción
     */
    public int getDenominador(){
        return this.denominador;
    }
    
    /**
     * Obtiene la fracción en formato String
     * @return fracción en formato String
     */
    public String toString(){
        
        return getNumerador() + "/" + getDenominador();
    }
    
    
    
    
}


