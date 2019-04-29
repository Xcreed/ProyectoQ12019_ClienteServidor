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
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 * 
 * @author Juan Pablo Mayorga, Marcela Ortega
 * @version 20190429
 */
public class Consola {
    //Atributos de la clase
    private static Date currentDate = new Date();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    protected static String archivoDiario = "bitacora/" + dateFormat.format(currentDate) + ".csv";
    protected static FileAdmin fileAdmin = null;
    protected static String bitacora;
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader teclado = new BufferedReader(isr);
    private static String[] operacion = new String[3];
    private static int numerador1;
    private static int numerador2;
    private static int denominador1;
    private static int denominador2;
    private static String[][] registros;
    
      
    /**
     * M&eacute;todo principal de la clase Consola
     * @param args
     * @throws Exception en caso de errores
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("Bienvenido!");
        
        for(;;) {
            System.out.println("\nIngrese el número correspondiente a la opci\u00f3n que desea realizar.");
            System.out.println("1. Realizar operación entre fracciones.\n2. Visualizar la bitácora.\n3. Salir.");
            
            try { 
                String seleccionDeUsuario = teclado.readLine();
                int accionARealizar = Integer.parseInt(seleccionDeUsuario);

                switch(accionARealizar) {
                    case 1:
                        System.out.println("Por favor, ingrese la operaci\u00f3n con el siguiente formato:\nFracci\u00f3n Operando Fracci\u00f3n");
                        //Necesita un switch case para que el usuario escoja si quiere ver la bitacora o realizar un calculo



                        try {

                            String operacionDeUsuario = teclado.readLine();

                            if (operacionDeUsuario.contains("/")) {
                                //Separa el input del usuario en el formato dado
                                operacion[0] = operacionDeUsuario.split(" ")[0].trim(); // fracción 1
                                operacion[1] = operacionDeUsuario.split(" ")[1].trim(); // operando
                                operacion[2] = operacionDeUsuario.split(" ")[2].trim(); // fracción 2


                                if (!operacion[0].contains("/")) {
                                    numerador1 = numerador1 = Integer.parseInt(operacion[0]);
                                    denominador1 = 1;
                                    numerador2 = Integer.parseInt(operacion[2].split("/")[0]);
                                    denominador2 = Integer.parseInt(operacion[2].split("/")[1]);
                                } 

                                else if(!operacion[2].contains("/")) {
                                    numerador1 = Integer.parseInt(operacion[0].split("/")[0]);
                                    denominador1 = Integer.parseInt(operacion[0].split("/")[1]);
                                    numerador2 = Integer.parseInt(operacion[2]);
                                    denominador2 = 1;
                                } 

                                else {
                                    numerador1 = Integer.parseInt(operacion[0].split("/")[0]);
                                    denominador1 = Integer.parseInt(operacion[0].split("/")[1]);
                                    numerador2 = Integer.parseInt(operacion[2].split("/")[0]);
                                    denominador2 = Integer.parseInt(operacion[2].split("/")[1]);
                                }

                                crearOperacion();
    //                            
                            } 

                            else {

                                operacion[0] = operacionDeUsuario.split(" ")[0].trim(); // fracción 1
                                operacion[1] = operacionDeUsuario.split(" ")[1].trim(); // operando
                                operacion[2] = operacionDeUsuario.split(" ")[2].trim(); // fracción 2

                                numerador1 = Integer.parseInt(operacion[0]);
                                denominador1 = 1;
                                numerador2 = Integer.parseInt(operacion[2]);
                                denominador2 = 1;
                                crearOperacion();

                            }

                        }

                        catch (NumberFormatException nfe) { //Fraccion no tiene numerador o tiene letras
                            System.out.println("La fracci\u00f3n no posee el formato correcto. Verifique y vuelva a intentar.");
                        } 

                        catch(ArrayIndexOutOfBoundsException aiobe) { //La operación no contiene el formato correcto porque no tiene espacios
                            System.out.println("Verifique el formato de la operaci\u00f3n.");
                        }
                        catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                        break;


                    case 2: 
                        File folder = new File("bitacora/");
                        File[] listOfFiles = folder.listFiles();

                        System.out.println("\nArchivos disponibles:");

                        //Se obtiene la lista de archivos disponibles
                        for(int i = 0; i < listOfFiles.length; i++) {
                            System.out.println(Integer.toString(i+1) + ". " + listOfFiles[i].getName());
                        }

                        //Se obtiene el input del usuario para el archivo seleccionado
                        String seleccionArchivo = teclado.readLine();
                        int idArchivo = Integer.parseInt(seleccionArchivo);

                        try {
                            fileAdmin = new FileAdmin("bitacora/" + listOfFiles[idArchivo-1].getName()); //Se define el file admin con el archivo que existe
                            cargarDatos();
                        } catch (Exception err) {
                            System.out.println("Error al abrir el archivo" + err.getMessage());         
                        }

                        break;
                    case 3:
                        System.out.println("\nGracias por utilizar nuestra aplicaci\u00f3n. Hasta la pr\u00f3xima!");
                        System.exit(0);
                    default:
                        System.out.println("Por favor seleccione una opci\u00f3n v\u00e1lida.");
                }
            } catch (Exception ex) {
                
                System.out.println("Por favor escoja una opci\u00f3n v\u00e1lida.");
            
            }

            
        }
        
    }    
    
    /**
    * Realiza la operación que se indicó al momento de recibir el input del usuario
    * @throws Exception cuando las fracciones no están en el formato correcto o el operando no es el correcto
    */
    private static void crearOperacion() throws Exception {
        
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
        
        //Sumar
        if (operacion[1].equals("+") || operacion[1].equalsIgnoreCase("sumar") ) {
            Operacion operacionARealizar = new Operacion(numerador1, denominador1, numerador2, denominador2, Operacion.OPERANDO.SUMA);
            System.out.println("El resultado de la operaci\u00f3n es: "+operacionARealizar.sumar());
            operacionARealizar.insertar(fileAdmin);
        }
        //Restar
        else if (operacion[1].equals("-") || operacion[1].equalsIgnoreCase("restar") ) {
            Operacion operacionARealizar = new Operacion(numerador1, denominador1, numerador2, denominador2, Operacion.OPERANDO.RESTA);
            System.out.println("El resultado de la operaci\u00f3n es: "+operacionARealizar.restar());
            operacionARealizar.insertar(fileAdmin);
        }
        //Multiplicar
        else if (operacion[1].equals("*") || operacion[1].equals("x") || operacion[1].equalsIgnoreCase("multiplicar") ) {
            Operacion operacionARealizar = new Operacion(numerador1, denominador1, numerador2, denominador2, Operacion.OPERANDO.MULTIPLICACION);
            System.out.println("El resultado de la operaci\u00f3n es: "+operacionARealizar.multiplicar());
            operacionARealizar.insertar(fileAdmin);
        }
        //Dividir
        else if (operacion[1].equals("/") || operacion[1].equalsIgnoreCase("dividir") ) {
            Operacion operacionARealizar = new Operacion(numerador1, denominador1, numerador2, denominador2, Operacion.OPERANDO.DIVISION);
            System.out.println("El resultado de la operaci\u00f3n es: "+operacionARealizar.dividir());
            operacionARealizar.insertar(fileAdmin);
        } 
        //No se usó el operando o formato correcto
        else {
            throw new Exception ("Por favor verifique el formato u operando utilizado");
        }
    }
    
    private static void cargarDatos () {
        try {
            //Se obtienen los registros del archivo
            String[] lasOperaciones = Operacion.getOperaciones(fileAdmin);
            if (lasOperaciones.length == 0) { throw new Exception ("El archivo no contiene registros."); }
            
            else{
                //Se inicializa la variable de registros para guardar cada linea de historial
                registros = new String[lasOperaciones.length][5];
                System.out.println("\nHistorial de operaciones:");

                //Se asignan los valores por columna y se imprimen en consola
                for(int i = 0; i < lasOperaciones.length; i++){
                    registros[i][0] = lasOperaciones[i].split(",")[0]; //Asignacion de fracción 1
                    registros[i][1] = lasOperaciones[i].split(",")[1]; //Asignacion de fracción 2
                    registros[i][2] = lasOperaciones[i].split(",")[2]; //Asignacion de operando
                    registros[i][3] = lasOperaciones[i].split(",")[3]; //Asignacion de resultado
                    registros[i][4] = lasOperaciones[i].split(",")[4]; //Asignacion de Hora
                  
                    System.out.println("Fracción 1: " + registros[i][0] + ", fracción 2: " + registros[i][1] +
                            ", operación: " + registros[i][2] + ", resultado: " + registros[i][3] +
                            ", hora: " + registros[i][4] + ".");
                    
                }
            }
            
        } catch (Exception err) {
            System.out.println("Error al cargar los datos del archivo." + err.getMessage());
        }
    }

}
