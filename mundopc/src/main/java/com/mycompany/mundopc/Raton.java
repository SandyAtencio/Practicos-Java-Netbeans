
package com.mycompany.mundopc;

public class Raton extends DispositivoEntrada{
    
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton =  ++contadorRatones;
    }

    @Override
    public String toString() {
        return "id raton: " + idRaton + "--- " + super.toString();
    }
    
    
    
}
