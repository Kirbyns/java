/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comercioeletronico;

/**
 *
 * @author matheus.oasilva
 */
public class Gerente extends Empregado {
    
    public double bonusAnual;

    public Gerente(double bonusAnual, String matricula, String nome, double salario) {
        super(matricula, nome, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    
    
    
}
