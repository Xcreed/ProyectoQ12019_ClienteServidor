package BL;

/**
 *
 * @author damar
 * @version 1.0
 * @since 2019-04-12 11:00 pm MDT
 */

public class Operacion extends Fraccion {
    
    private Fraccion fraccion2;
    public enum OPERANDO{
        SUMA,
        RESTA,
        MULTIPLICACION,
        DIVISION,
    }
    private OPERANDO operando;
    private String resultado;
    
    public Operacion() throws Exception{
        this("1/1","1/1",null);
    }
    
    public Operacion(String fraccion1, String fraccion2, OPERANDO operando) throws Exception{
        super(fraccion1);
        this.fraccion2 = new Fraccion(fraccion2);
        this.operando = operando;
    }
    
    public String sumar () throws Exception{
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
    
    public String restar () throws Exception {
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
    
    public String multiplicar () throws Exception {
        Fraccion resultado = new Fraccion();
        
        resultado.setNumerador(super.getNumerador() * fraccion2.getNumerador());
        resultado.setDenominador(super.getDenominador() * fraccion2.getDenominador());
        
        return simplificar(resultado.getNumerador(),resultado.getDenominador());    
    }
    
    public String dividir () throws Exception {
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
    
    private String simplificar (int numerador, int denominador) throws Exception {
        int divisor = mcd(numerador,denominador);
        Fraccion resultado = new Fraccion();
        
        resultado.setNumerador(numerador/divisor);
        resultado.setDenominador(denominador/divisor);
        
        this.resultado = resultado.toString();
        return resultado.toString();
    }
    
    @Override
    public String toString(){
        return super.toString()+","+ fraccion2.toString() + "," + operando + "," + resultado;
    }
}
