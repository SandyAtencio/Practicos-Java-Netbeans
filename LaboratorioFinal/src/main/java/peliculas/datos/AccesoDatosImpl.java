
package peliculas.datos;

import java.io.*;
import java.util.*;
import peliculas.domain.Pelicula;
import peliculas.execepciones.*;

public class AccesoDatosImpl implements AccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList();
        try {
                
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            //linea = entrada.readLine();
            while (lectura != null) {
                Pelicula pelicula = new Pelicula(lectura);
                peliculas.add(pelicula);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException e) {
             System.out.println("Error" + e);
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula);
            salida.close();
            System.out.println("Se ha anexado la pelicula en el catalogo");
            
        } catch (IOException e) {
            System.out.println("Error" + e); 
        }
    }

    @Override
    public String buscar(String buscar, String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        boolean encontrado = false;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            
            while (lectura != null & !encontrado) {
                if (lectura.equals(buscar)) {
                    encontrado = true;
                    lectura = entrada.readLine();
                }
                
                if(!encontrado){
                    buscar = null;
                    entrada.close();
                }
            }          
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
        return buscar;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter entrada = new PrintWriter(new FileWriter(archivo));
            entrada.close();
            System.out.println("se ha creado correctamente el archivo");
        } catch (IOException e) {
            System.out.println("Error" + e); 
        }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("Se ha eliminado correctamente el archivo");
    }
}

