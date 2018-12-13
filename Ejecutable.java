/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.jarvis;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        String ingreso = JOptionPane.showInputDialog("Ingrese frase:");
        
        
        Jarvis j = new Jarvis();
        //j.analizar(ingreso);
        //j.saludar();
        j.informacion("IronMan");
        j.fecha("01-10-1982");
        j.jeringoso(ingreso);
    }
    
}
