package BL;

/**
 *
 * @author damar
 * @version 1.0
 * @since 2019-04-12 11:00 pm MDT
 */

public class Operacion extends Fraccion {
    
    private Fraccion fraccion2;
    
    public Operacion(){
        this(0,0,0,0);
    }
    
    public Operacion(int numerador1, int denominador1, int numerador2, int denominador2){
        super(numerador1, denominador1);
        this.fraccion2 = new Fraccion(numerador2, denominador2);
    }
    
    public String sumar (){
        Fraccion resultado = new Fraccion();
        
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
        Fraccion resultado = new Fraccion();
        
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
        Fraccion resultado = new Fraccion();
        
        resultado.setNumerador(super.getNumerador() * fraccion2.getNumerador());
        resultado.setDenominador(super.getDenominador() * fraccion2.getDenominador());
        
        return simplificar(resultado.getNumerador(),resultado.getDenominador());    
    }
    
    public String dividir () {
        Fraccion resultado = new Fraccion();
        
        resultado.setNumerador(super.getNumerador() * fraccion2.getDenominador());
        resultado.setDenominador(super.getDenominador() * fraccion2.getNumerador());
        
        return simplificar(resultado.getNumerador(),resultado.getDenominador());  
    }
    
    private int mcd (int numerador, int denominador) {
        if (numerador % denominador == 0) {
            return denominador;
        } else {
          return mcd(denominador, numerador % denominador);  
        }
    }
    
    private String simplificar (int numerador, int denominador) {
        int divisor = mcd(numerador,denominador);
        Fraccion resultado = new Fraccion();
        
        resultado.setNumerador(numerador/divisor);
        resultado.setDenominador(denominador/divisor);
        
        return resultado.toString();
    }
    
    @Override
    public String toString(){
        return super.toString()+","+ fraccion2.toString();
    }
}
