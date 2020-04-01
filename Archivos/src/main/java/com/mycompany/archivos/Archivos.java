
package com.mycompany.archivos;
import java.io.*;

public class Archivos {
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("El Archivo se ha creado correctamente");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void escribirArchivo(String nombreArhivo){
        File archivo = new File(nombreArhivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.println("Contenido escrito en el archivo");
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo\n");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
        public static void leerrArchivo(String nombreArhivo){
        File archivo = new File(nombreArhivo);
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura =  entrada.readLine();
            while(lectura != null){
                System.out.println("Lectura: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
        
        public static void anexarArchivo(String nombreArchivo){
            File archivo = new File(nombreArchivo);
            try{
                PrintWriter entrada = new PrintWriter(new FileWriter(archivo, true));
                entrada.println("Anexando mas informacion al archivo");
                entrada.println();
                entrada.println("Fin de anexar");
                entrada.close();
                System.out.println("Se ha anexado la inforacion correctamente al archivo\n");
            }catch(IOException e){
                e.printStackTrace();
            }
        }
}
