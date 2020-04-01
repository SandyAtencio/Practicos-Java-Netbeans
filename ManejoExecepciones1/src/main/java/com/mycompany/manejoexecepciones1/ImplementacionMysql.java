package com.mycompany.manejoexecepciones1;

public class ImplementacionMysql implements AccesoDatos{
    
    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if(simularError){
            throw new EscrituraDatosEx("Error de escritura.");
        }else{
            System.out.println("Insertar desde Mysql");
        }
    }

    @Override
    public void listar() throws AccesoDatosEx {
        if(simularError){
            throw new LecturaDatosEx("Error de lectura de datos");
        }else{
            System.out.println("Listar desde Mysql");
        }
    }

    public boolean isSimularError() {
        return simularError;
    }
    
    @Override
    public void simularError(boolean simularError) {
       this.simularError = simularError;
    }
    
}
