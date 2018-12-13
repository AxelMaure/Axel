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
public class Bota {
    int consumo;
    int daño;
    
    public void caminar(int tiempo){
        
        consumo = 1;
        Bateria.consumo(tiempo,consumo);
    
    }
    
    public void correr(int tiempo){
    consumo = 2;
    
    }
    
    public int estado(){
        return daño;
    }
    
    public void propulsarse(int tiempo){
        consumo = 3;
        Bateria.consumo(tiempo,consumo);
    }
    
}
