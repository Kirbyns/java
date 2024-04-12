/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comercioeletronico;

/**
 *
 * @author matheus.oasilva
 */
public class Entregador extends Empregado {
    
    public double entregaBemSucedida;

    public Entregador(String matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }

    public double getEntregaBemSucedida() {
        return entregaBemSucedida;
    }

    public void setEntregaBemSucedida(double entregaBemSucedida) {
        this.entregaBemSucedida = entregaBemSucedida;
    }
    
    
    
}
