/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alunos;

/**
 *
 * @author matheus.oasilva
 */
public class Alunos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        aluno aluno1 = new aluno("matheus",3231,8);
        
        aluno1.setNome("maria agora");
        aluno1.setMatricula(321321);
        aluno1.setNota(9.0);
        
        System.out.println("nome do aluno: "+aluno1.getNome());
        
        System.out.println("Matricula do aluno: "+aluno1.getMatricula());
        
        System.out.println("Nota do aluno: "+aluno1.getNota());
    }
}
