/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author creed
 */
public class FileAdmin {
    
    private File a=null;
    
    /**
     * Instancia el archivo con el valor ingresado.
     * @param archivo Nombre y direcci&oacute;n del archivo a utilizar.
     * @throws Exception En caso de errores.
     */
    protected void setArchivo(String archivo) throws Exception{
        if(archivo==null){ throw new Exception("El archivo origen es null."); }
        if(archivo.equals("")){ throw new Exception("El archivo origen esta vacio."); }
        
        File f = new File(archivo);
        if(!f.exists()){ throw new Exception("El archivo origen no exite."); }
        if(f.isDirectory()){ throw new Exception("El archivo origen no puede ser una carpeta."); }
        
        a=f;
    }
    
    /**
     * Retorna en archivo origen.
     * @return <code>File</code> Archivo origen.
     */
    public File getArchivo(){ return a; }
    
    /**
     * Constructor principal de la clase FileAdmin
     * @param archivo Nombre y direcci&oacute;n del archivo a utilizar.
     * @throws Exception En caso de errores.
     */
    public FileAdmin(String archivo) throws Exception{
        setArchivo(archivo);
    }
    
    /**
     * M&eacute;todo que recorre todo el archivo y estrae todos los registros.
     * @return <code>String[]</code> Vector de tipo String con todos los registros del archivo.
     * @throws Exception En caso de errores.
     */
    public String[] extraerRegistros() throws Exception{
        BufferedReader lector=null;
        List<String> lstTemp = new ArrayList<>();
        try{
            // Instanciacion del lector de archivos y apertura del archivo.
            lector = new BufferedReader( new FileReader( getArchivo() ) );
            // Se lee la primer línea del archivo.
            String linea = lector.readLine();
            // Si no es null significa que no es fin de archivo
            // y entoces recorremos el archivo para extraer los datos.
            while( linea != null ){
                // Se agrega la linea leida a la lista.
                lstTemp.add(linea);
                // Se lee la siguiente linea.
                linea = lector.readLine();
            }
        }
        catch(Exception err){
            throw new Exception("Error al extraer los registros.\n- " + err.getMessage());
        }
        finally{
            // Se cierra el buffer.
            try{
                if(lector!=null){
                    lector.close();
                }
            } catch(Exception e) {
                throw new Exception("Error inesperado al cerrar el buffer.\n- " + e.getMessage());
            }
        }
        
        // Se convierte la lista a vector para retornarlo.
        return lstTemp.toArray(new String[lstTemp.size()]);
    }
    
    /**
     * M&eacute;todo que escribe el registro en el archivo.
     * @param r Registro a escribrir en el archivo.
     * @throws Exception En caso de errores.
     */
    public void insertarRegistro(String r) throws Exception{
        PrintWriter escritor = null;
        
        try{
            // Instanciacion del escritor de archivos y apertura del archivo.
            escritor = new PrintWriter( new FileWriter( getArchivo( ), true ) );
            // Se escribe el registro (linea) en el archivo.
            escritor.println(r);
        }
        catch(Exception err){
            throw new Exception("Error al escribir el registro en el archivo.\n- " + err.getMessage());
        }
        finally{
            // Se cierra el escritor.
            try{
                if(escritor!=null){
                    escritor.close();
                }
            }catch(Exception e) {
                throw new Exception("Error inesperado al cerrar el escritor.\n- " + e.getMessage());
            }
        }
    }
}
