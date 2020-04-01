
package com.mycompany.laboratoriofinal;

import java.util.Scanner;
import peliculas.domain.Pelicula;
import peliculas.negocio.*;

public class LaboratorioFinal {
    
    private static final String NOMBRE_ARCHIVO = "C:\\Users\\satencioh\\Desktop\\DESARROLLO\\CatalogoPeliculas\\Peliculas.txt";
    private static final CatalogoPeliculas CATALOGOPELICULAS = new CatalogoPeliculasImpl();
    private static final Scanner ENTRADA = new Scanner(System.in);
    private static int OPCION = 0;

    public static void main(String[] args) {
       

        
        try {
            do {
                System.out.println("Ingrese una opcion");
                System.out.println("1.- Iniciar catalogo películas");
                System.out.println("2.- Agregar película");
                System.out.println("3.- Listar Películas");
                System.out.println("4.- Buscar Película");
                System.out.println("0.- Salir");
                
                OPCION = Integer.parseInt(ENTRADA.nextLine());
                
                switch (OPCION) {
                    case 1:
                        CATALOGOPELICULAS.iniciarArchivo(NOMBRE_ARCHIVO);
                        break;
                    case 2:
                        System.out.println("Introduce el nombre de una pelicula a agregar: ");
                        String nombre = ENTRADA.nextLine();
                        CATALOGOPELICULAS.agregarPelicula(nombre, NOMBRE_ARCHIVO);
                        break;
                    case 3:
                        CATALOGOPELICULAS.listarPelicula(NOMBRE_ARCHIVO);
                        break;
                    case 4:
                        System.out.println("Introduce el nombre de una pelicula a buscar:");
                        String buscar = ENTRADA.nextLine();
                        CATALOGOPELICULAS.buscarPelicula(NOMBRE_ARCHIVO, buscar);
                        break;
                    case 0:
                        System.out.println("Adios!!!");
                        break;
                    default:
                        System.out.println("opcion incorretca");
                        break;
                }
                System.out.println("\n");
                
            } while (OPCION != 0);
        } catch (Exception e) {
            System.out.println("Error!");
        }
        
    }
}
    
