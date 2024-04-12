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
public class criarRetangulo {
   private double base;
    private double altura;
    
    
   public criarRetangulo(double base, double altura){
       
       this.altura = altura;
       this.base = base;
   }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
   
   public double calcularArea(){
       
       return (base*altura)/2;
       
       
       
   }
    
}
