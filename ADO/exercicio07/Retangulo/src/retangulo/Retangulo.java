/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

/**
 *
 * @author matheussilva
 */
public class Retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        criarRetangulo retangulo1 = new criarRetangulo(5,2);
        
        System.out.println("a area do retangulo é "+retangulo1.calcularArea()); // aqui eu imprimi direto em vez de guardar em uma variavel mas acho mais legal guardar. 
        
    }
    
}
