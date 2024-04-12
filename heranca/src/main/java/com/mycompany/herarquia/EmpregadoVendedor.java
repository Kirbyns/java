/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herarquia;

/**
 *
 * @author matheus.oasilva
 */
public class EmpregadoVendedor extends Empregado {
    
    private double totalVendaMes;

    public EmpregadoVendedor(double totalVendaMes, String matricula, String nome, double salario) {
        //chaa o construtor da superclass para inicializar os atributos herdados 
        super(matricula, nome, salario);
        this.totalVendaMes = totalVendaMes;
    }
    
    
    
}
