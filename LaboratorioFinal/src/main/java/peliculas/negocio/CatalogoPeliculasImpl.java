
package peliculas.negocio;

import java.util.*;
import peliculas.datos.*;
import peliculas.domain.Pelicula;
import peliculas.execepciones.*;

public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    
    private final AccesoDatos datos;
    
    public CatalogoPeliculasImpl(){
        
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombreArchivo);
        boolean anexar = false;
        try{
            anexar = datos.existe(nombreArchivo);
            datos.escribir(pelicula, nombreArchivo, anexar);
        }catch(AccesoDatosEx e){
            System.out.println("Error de acceso a datos" + e); 
        }
    }

    @Override
    public void listarPelicula(String nombreArchivo) {
        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            Iterator<Pelicula> it = peliculas.iterator();
            while(it.hasNext()){
                System.out.println("Pelicula: " + it.next());
            }
            System.out.println();
        } catch(AccesoDatosEx e){
            System.out.println("Error de acceso a datos" + e);
        }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
       
        try {
            String peliEncontrada = datos.buscar(nombreArchivo, buscar);
            if(peliEncontrada != null){
            System.out.println("Se encontro la pelicula " + buscar + " en el catalogo");
            }else{
                System.out.println("no encontro la pelicula " + buscar + " en el catalogo");
            }
            
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la pelicula" + ex);
        }
        
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try{
            if(datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            }else{
                datos.crear(nombreArchivo);
            }
        }catch(AccesoDatosEx e){
            System.out.println("Error de acceso a datos" + e);
        }
    }
}
