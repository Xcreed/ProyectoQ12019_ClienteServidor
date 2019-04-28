package BL;

import DA.FileAdmin;
import GUI.jfrmGUI;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private Date date = new Date();
    /**
     * Constructor con valores por omisión
     * @throws Exception 
     */
    public Operacion() throws Exception{
        this(1,1,1,1,null);
    }
    
    /**
     * Constructor con los valores completos para realizar la operación
     * @param fraccion1 de la operación
     * @param fraccion2 de la operación
     * @param operando para realizar la operación
     * @throws Exception cuando el formato no es el correcto
     */
    public Operacion(int numerador1, int denominador1, int numerador2, int denominador2, OPERANDO operando) throws Exception{
        super(numerador1, denominador1);
        this.fraccion2 = new Fraccion(numerador2, denominador2);
        this.operando = operando;
    }
    
    
    public String sumar () throws Exception{
        
        int numerador;
        int denominador;
        
        Fraccion resultado = new Fraccion();
        
        if (super.getDenominador() == fraccion2.getDenominador()) {
            numerador = super.getNumerador() + fraccion2.getNumerador();
            denominador = super.getDenominador();
        } else {
            numerador = super.getNumerador()*fraccion2.getDenominador()+(super.getDenominador()*fraccion2.getNumerador());
            denominador = super.getDenominador()*fraccion2.getDenominador();
        }
            
        if ( numerador == 0 || denominador == 0) {  return this.resultado = "0";  }
        
        else {
        
            resultado.setNumerador(numerador);
            resultado.setDenominador(denominador);

            return simplificar(resultado.getNumerador(),resultado.getDenominador());
        }
    } 
    
    public String restar () throws Exception {
        
        int numerador;
        int denominador;
        
        Fraccion resultado = new Fraccion();
        
        if (super.getDenominador() == fraccion2.getDenominador()) {
            numerador = super.getNumerador() - fraccion2.getNumerador();
            denominador = super.getDenominador();
        } else {
            numerador = super.getNumerador()*fraccion2.getDenominador() - (super.getDenominador()*fraccion2.getNumerador());
            denominador = super.getDenominador()*fraccion2.getDenominador();
        }
            
        if (numerador == 0 || denominador == 0) {  return this.resultado = "0";  }
        
        else {
        
            resultado.setNumerador(numerador);
            resultado.setDenominador(denominador);

            return simplificar(resultado.getNumerador(),resultado.getDenominador());
        }
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
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String registro = toString() + "," + sdf.format(date);
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
