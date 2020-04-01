package com.mycompany.mundopc;

public class Monitor {
    
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private Monitor(){
        idMonitor = ++contadorMonitores;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "idMonitor: " + idMonitor + ", marca: " + marca + ", tamaño: " + tamanio + ", contadorMonitores: " + contadorMonitores;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    
    
}
