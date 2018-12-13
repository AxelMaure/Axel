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
public class Guante {
    int daño;
    int consumo = 100;
    
    
    public int usar(int intensidad, int tiempo){
        return consumo * intensidad * tiempo;
    }
    
}
