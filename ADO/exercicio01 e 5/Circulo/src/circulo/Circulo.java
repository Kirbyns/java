/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

/**
 *
 * @author matheussilva
 */
public class Circulo {
    public static void main(String[] args) {
        CriaCirculo circulo1 = new CriaCirculo(200.0);
        CriaCirculo circulo2 = new CriaCirculo(250.0);
        
        double areaDoCirculo = circulo1.calcularArea();
        
        System.out.println("A área do círculo1 é: " + areaDoCirculo);
        System.out.println("A área do círculo2 é: " + circulo2.calcularArea()); //jeitos diferentes em! 
    }
}
