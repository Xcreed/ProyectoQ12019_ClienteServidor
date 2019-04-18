/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.Operacion;
import DA.FileAdmin;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Juan Pablo Mayorga
 */
public class Consola {
    
    private static Date currentDate = new Date();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    protected static String archivoDiario = "bitacora/" + dateFormat.format(currentDate) + ".csv";
    protected static FileAdmin fileAdmin = null;
    protected static String bitacora;
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader teclado = new BufferedReader(isr);
    private static String[] operacion = new String[3];
      
    /**
     * Método principal de la clase Consola
     * @param args 
     */
    public static void main(String[] args) {
        
    
        
        try {
            File file = new File(archivoDiario);
            if (file.exists() && file.isFile() && file.canRead()) {
                fileAdmin = new FileAdmin(archivoDiario); //Se define el file admin con el archivo que existe
            } else {
                file.createNewFile(); //Se crea el archivo
                fileAdmin = new FileAdmin(archivoDiario); //Se define el file admin con el nuevo archivo
            } 
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }


        System.out.println("Por favor ingrese la operacion con el siguiente formato:\nFraccion 1 operando Fraccion 2");
            //Necesita un switch case para que el usuario escoja si quiere ver la bitacora o realizar un calculo

        try {

            String operacionDeUsuario = teclado.readLine();
            //Separa el input del usuario en el formato dado
            operacion[0] = operacionDeUsuario.split(" ")[0].trim();
            operacion[1] = operacionDeUsuario.split(" ")[1].trim();
            operacion[2] = operacionDeUsuario.split(" ")[2].trim();
            crearOperacion();

        } 

        catch(ArrayIndexOutOfBoundsException aiobe) { //La operación no contiene el formato correcto porque no tiene espacios
            System.out.println("Verifique el formato de la operaci\u00f3n.");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    
    /**
     * Realiza la operación que se indicó al momento de recibir el input del usuario
     * @throws Exception cuando las fracciones no están en el formato correcto o el operando no es el correcto
     */
    private static void crearOperacion() throws Exception {
        //Sumar
        if (operacion[1].equals("+") || operacion[1].equalsIgnoreCase("sumar") ) {
            Operacion operacionARealizar = new Operacion(operacion[0], operacion[2],Operacion.OPERANDO.SUMA);
            System.out.println("El resultado de la operaci\u00f3n es: "+operacionARealizar.sumar());
            operacionARealizar.insertar(fileAdmin);
            System.out.println(operacionARealizar.toString());
        }
        //Restar
        else if (operacion[1].equals("-") || operacion[1].equalsIgnoreCase("restar") ) {
            Operacion operacionARealizar = new Operacion(operacion[0], operacion[2],Operacion.OPERANDO.RESTA);
            System.out.println("El resultado de la operaci\u00f3n es: "+operacionARealizar.restar());
            operacionARealizar.insertar(fileAdmin);
            System.out.println(operacionARealizar.toString());
        }
        //Multiplicar
        else if (operacion[1].equals("*") || operacion[1].equals("x") || operacion[1].equalsIgnoreCase("multiplicar") ) {
            Operacion operacionARealizar = new Operacion(operacion[0], operacion[2],Operacion.OPERANDO.MULTIPLICACION);
            System.out.println("El resultado de la operaci\u00f3n es: "+operacionARealizar.multiplicar());
            operacionARealizar.insertar(fileAdmin);
            System.out.println(operacionARealizar.toString());
        }
        //Dividir
        else if (operacion[1].equals("/") || operacion[1].equalsIgnoreCase("dividir") ) {
            Operacion operacionARealizar = new Operacion(operacion[0], operacion[2],Operacion.OPERANDO.DIVISION);
            System.out.println("El resultado de la operaci\u00f3n es: "+operacionARealizar.dividir());
            operacionARealizar.insertar(fileAdmin);
            System.out.println(operacionARealizar.toString());
        } 
        //No se usó el operando o formato correcto
        else {
            throw new Exception ("Por favor verifique el formato u operando utilizado");
        }
                
                
    
    }
   
}
