/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.jarvis;

/**
 *
 * @author cidcampeador
 */
public class Armadura {
    public String colorPrimario;
    public String colorSecundario;
    public int resistencia;
    
    public Guante guanteDerecho;
    public Guante guanteIzquierdo;
    
    public Bateria bateria;
    
    public void volar(int tiempo){ 
        int energia = 0;
        energia += guanteDerecho.usar(2, tiempo);
        energia += guanteIzquierdo.usar(2, tiempo);
        bateria.estado();       
        bateria.consumir(energia);
    }
}
}
