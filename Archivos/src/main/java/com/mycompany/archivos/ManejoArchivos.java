
package com.mycompany.archivos;

public class ManejoArchivos {
    
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\satencioh\\Desktop\\DESARROLLO\\pruebaArchivos\\archivo.txt";
     
    public static void main(String[] args) {
        
        Archivos.crearArchivo(NOMBRE_ARCHIVO);
        Archivos.escribirArchivo(NOMBRE_ARCHIVO);
        Archivos.leerrArchivo(NOMBRE_ARCHIVO);
        Archivos.anexarArchivo(NOMBRE_ARCHIVO);
        Archivos.leerrArchivo(NOMBRE_ARCHIVO);
    }
}
