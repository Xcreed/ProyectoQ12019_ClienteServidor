package BL;

import DA.FileAdmin;
import GUI.jfrmGUI;

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
    
    /**
     * Constructor con valores por omisión
     * @throws Exception 
     */
    public Operacion() throws Exception{
        this("1/1","1/1",null);
    }
    
    /**
     * Constructor con los valores completos para realizar la operación
     * @param fraccion1 de la operación
     * @param fraccion2 de la operación
     * @param operando para realizar la operación
     * @throws Exception cuando el formato no es el correcto
     */
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
    
    public static String[] getOperaciones(FileAdmin fa) throws Exception{
        if (fa==null) { 
            throw new Exception("El administrador de archivos no debe ser nulo al obtener la operacion."); 
        }
        
        String[] registros = null;
        
        try {
            // Se extraen todos los registros del archivo.
            registros = fa.extraerRegistros();
            // Se recorren uno a uno para instanciarlos y agregarlos al vector.
            for (String r : registros) {
                // Se separan los datos del registro separados por ",".
                String[] datos = r.split(",");
            }
        }catch(Exception err) {
            throw new Exception("Error en el metodo getOperaciones(FileAdmin).\n- " + err.getMessage());
        }
        
        return registros;
    }
    
    public void insertar(FileAdmin fa) throws Exception {
        if (fa == null) {
            throw new Exception("El administrador de archivos no debe ser nulo al insertar."); 
        }
        
        try {
            String registro = toString();
            fa.insertarRegistro(registro);
        } catch(Exception err) {
            throw new Exception("Error en el metodo insertar(FileAdmin, Operacion).\n- " + err.getMessage());
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+","+ fraccion2.toString() + "," + operando + "," + resultado;
    }
}
