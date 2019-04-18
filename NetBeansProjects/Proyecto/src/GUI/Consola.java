/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.Fraccion;
import BL.Operacion;
import DA.FileAdmin;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author creed
 */
public class Consola {
    
    protected static String resultado = "/";
    static Date currentDate = new Date();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    protected static String archivoDiario = "bitacora/" + dateFormat.format(currentDate) + ".csv";
    protected static FileAdmin fileAdmin = null;
    protected static String bitacora;
    
    public static void main(String[] args) {
        
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader teclado = new BufferedReader(isr);
    Object[] operacion = new Object[3];
    Fraccion fraccion1Valida; 
    Fraccion fraccion2Valida;
    String operando = null;
    
    
    boolean vectorNoLleno = true;
        //Tira errores pero no finaliza si las entradas tuvieron errores
        while(vectorNoLleno){
            
        try {
            
            File file = new File(archivoDiario);
            if (file.exists() && file.isFile() && file.canRead()) {
                fileAdmin = new FileAdmin(archivoDiario); //Se define el file admin con el archivo que existe
            } else {
                file.createNewFile(); //Se crea el archivo
                fileAdmin = new FileAdmin(archivoDiario); //Se define el file admin con el nuevo archivo
            }
            
            String fraccion1 = teclado.readLine();
            fraccion1Valida = new Fraccion(fraccion1);
            operando = teclado.readLine();
            String fraccion2 = teclado.readLine();
            fraccion2Valida = new Fraccion(fraccion2);
            //operacion[2] = new Fraccion(fraccion2);
            vectorNoLleno = false;
            crearOperacion(fraccion1Valida, fraccion2Valida, operando);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
            
            
        }
        
    }

    private static void crearOperacion(Fraccion fraccion1, Fraccion fraccion2, String operando) throws Exception {
        if (operando.equals("+")) {
            Operacion operacion = new Operacion(fraccion1, fraccion2,Operacion.OPERANDO.SUMA);
            resultado = operacion.sumar();
            operacion.insertar(fileAdmin);
            System.out.println(operacion.toString());
        }
                
                
    
    }
   
}
