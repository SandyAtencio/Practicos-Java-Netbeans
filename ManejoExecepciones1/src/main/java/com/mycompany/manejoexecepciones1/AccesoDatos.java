package com.mycompany.manejoexecepciones1;

public interface AccesoDatos {
    
    public abstract void insertar() throws AccesoDatosEx;
    public abstract void listar() throws AccesoDatosEx;
    public abstract void simularError(boolean simularError);
    
}
