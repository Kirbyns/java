/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author matheussilva
 */
public class criarCarro {
    String marca;
    String modelo;
 
    
    public criarCarro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void exibirInformacao(){ //quebrei cabeça aqui pq achei que precisasse do String kk
        
        System.out.println("Esse carro possui o modelo "+modelo);
        System.out.println("Esse carro possui a Marca "+marca);
        
        
    }
}
