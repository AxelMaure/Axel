/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.jarvis;

import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

/**
 *
 * @author Javier
 */

public class Jarvis {
    
    public void analizar(String letra) {
      String mayus;  
        
        
      System.out.println(letra);
      Character c = letra.charAt(0);
      System.out.println("Caracter: " + c);
      System.out.println("Es Digito? " + Character.isDigit(c));
      System.out.println("Es Letra? " + Character.isAlphabetic(c));
      
      mayus = letra.toUpperCase();
      System.out.println("en MAYUSCULAS es " + mayus);
      System.out.println("en minusculas es " + letra.toLowerCase());
    }
    
    public void informacion(String frase){
        
        int largo = frase.length();
        System.out.println("La Frase es:" + frase);
        System.out.println("Cantidad de Caracteres:" + largo);
        System.out.println("Primera Mitad:" + frase.substring(0,largo/2));
        System.out.println("Segunda Mitad:" + frase.substring(largo/2,largo));
        System.out.println("en MAYUSCULAS es " + frase.toUpperCase());
        System.out.println("en minusculas es " + frase.toLowerCase());
        System.out.println("Capitalizado es: " + frase.substring(0, 1).toUpperCase() + frase.substring(1).toLowerCase());
    }
         
    public void fecha(String fechaentrada){
        System.out.println("Informacion de Fecha:" + fechaentrada);
        System.out.println("Dia :" + fechaentrada.substring(0, 2));
        System.out.println("Mes :" + fechaentrada.substring(3, 5));
        System.out.println("Año :" + fechaentrada.substring(6, 10));
    }
    
    public void jeringoso(String entrada) {
        String salida = new String();
        int largo = entrada.length();
        System.out.println("Frase de Entrada:" + entrada);
        Character c = entrada.charAt(0);
        System.out.println("Cuenta hasta: " + largo);
           
        for (int i = 0; i <= (largo-1); i++) {
                  
            if ( entrada.charAt(i) == 'a') {

                
                salida = salida.concat(entrada.charAt(i)+"pa");
            } else if ( entrada.charAt(i) == 'e') {
                
                salida = salida.concat(entrada.charAt(i)+"pe");
            } else if ( entrada.charAt(i) == 'i') {
                
                salida = salida.concat(entrada.charAt(i)+"pi");
            } else if ( entrada.charAt(i) == 'o') {
                
                salida = salida.concat(entrada.charAt(i)+"po");
            } else if ( entrada.charAt(i) == 'u') {
                
                salida = salida.concat(entrada.charAt(i)+"pu");
            } else {
                salida = salida.concat(entrada.charAt(i)+"");
            }

        }
        System.out.println("frase salida en jeringoso" + salida);
        
    }
    
  
 
    
    
    public void saludar() throws InterruptedException {
        String saludo = "Say Hello to my Little friend.";
        decir(saludo);
        
    }

    public void escribir(String texto){
        System.out.print(texto);
    }
    
    public void decir(String texto) {
        try {
           // set property as Kevin Dictionary
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        // Register Engine
        Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
        // Create a Synthesizer
        Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));

        // Allocate synthesizer
        synthesizer.allocate();
        // Resume Synthesizer
        synthesizer.resume();
        // speaks the given text until queue is empty.
        synthesizer.speakPlainText(texto, null);
        synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
        // Deallocate the Synthesizer.
        synthesizer.deallocate();
        } catch (Exception e) {
        e.printStackTrace();
}
}
 
}




