package com.mycompany.varargs;

public class VarArgs {
    public static void main(String[] args) {
        imprimirForElementos(10,15,20,25,30,35);
        System.out.println("");
        imprimirForEachNumeros(2,4,6,8,10,12,14);
        System.out.println("");
        imprimirVariosArgumentos("Sergio", true, 15,20,14);
    }
    
    public static void imprimirForElementos(int... numeros){
        //int elementos;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ":" + numeros[i]);
        }
    }
    
    public static void imprimirForEachNumeros(int... numeros){
        for (int numero : numeros) {
            System.out.println("El numero es: " + numero);
        }
    }
    
    public static void imprimirVariosArgumentos(String nombre, boolean valido, int... numeros){
        System.out.println("Nombre: " + nombre);
        System.out.println("Valido: " + valido);
        for (int numero : numeros) {
            System.out.println("El numero es: " + numero);
        }
    }
}
