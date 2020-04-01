
package com.mycompany.mundopc;

public class MundoPC {
    
    public static void main(String[] args) {
        
        Monitor monitorDell = new Monitor("Dell", 17);
        Teclado tecladoDell = new Teclado("conector","Dell");
        Raton ratonDell = new Raton("bluetooth","Dell");
        Computadora compuDell = new Computadora("PC Dell Gamer", monitorDell, tecladoDell, ratonDell);
        
        Monitor monitorAsus = new Monitor("Asus", 14);
        Teclado tecladoAsus = new Teclado("bluetooth","Asus");
        Raton ratonAsus = new Raton("bluetooth","Asus");
        Computadora compuAsus = new Computadora("PC Asus", monitorAsus, tecladoAsus, ratonAsus);
        
        Computadora compuEnsamblada = new Computadora("Compu Ensamblada", monitorAsus, tecladoDell, ratonAsus);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuDell);
        orden1.agregarComputadora(compuAsus);
        
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuEnsamblada);
        orden2.agregarComputadora(compuAsus);
        System.out.println("");
        
        orden2.mostrarOrden();
//        

    }
}
