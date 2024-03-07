/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alunos;

/**
 *
 * @author matheus.oasilva
 */
public class aluno {
    
    private String nome;
    private int matricula;
    private double nota;
    

//construtores

public aluno(String nome,int matricula, double nota){
    this.nome = nome;
    this.matricula = matricula; 
    this.nota = nota;


}

public String getNome(){
    return nome;
}
public int getMatricula(){
    return matricula;
}
public double getNota(){
    return nota;
}

public void setNome(String nome){
    this.nome = nome;
}
public void setMatricula(int matricula){
    this.matricula = matricula;
}
public void setNota(double nota){
    this.nota = nota;
}

}
