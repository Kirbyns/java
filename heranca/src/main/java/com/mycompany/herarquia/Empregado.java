/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herarquia;

/**
 *
 * @author matheus.oasilva
 */
public class Empregado {

    private String matricula;
    private String nome;
    private double salario;

    //construtor
    public Empregado(String matricula, String nome, double salario) {

        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaPagamento(){
       //implementação basica apenas retorna o salario
       return salario;
    }

}
