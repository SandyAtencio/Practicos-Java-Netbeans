package com.mycompany.mundopc;

public class Teclado extends DispositivoEntrada{
    
    private final int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
       idTeclado = ++contadorTeclado;
    }

    @Override
    public String toString() {
        return "idTeclado: " + idTeclado + " ---- " + super.toString();
    }
    
    
    
}
