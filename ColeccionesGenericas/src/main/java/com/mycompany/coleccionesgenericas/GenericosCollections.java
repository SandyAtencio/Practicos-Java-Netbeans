package com.mycompany.coleccionesgenericas;

import java.util.*;

public class GenericosCollections {
    
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("1");
        imprimir(lista);
        
        Set<String> set = new HashSet<String>();
        set.add("100");
        set.add("400");
        set.add("200");
        set.add("100");
        imprimir(set);
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "Sergio");
        map.put("2", "Sandy");
        map.put("3", "Manzana");
        map.put("4", "Pera");
        imprimir(map.keySet());
        imprimir(map.values());
       
        
    }
    public static void imprimir(Collection<String> colecciones){
        for (String coleccion : colecciones) {
            System.out.println(coleccion + " ");
        }
        System.out.println("");
    }
}
