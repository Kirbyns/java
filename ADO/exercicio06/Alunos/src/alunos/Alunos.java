/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunos;

/**
 *
 * @author matheussilva
 */
public class Alunos {

 
    
       
    public static void main(String[] args) {
          // professor, nesse exercicio você não pediu para imprimir mas vou imprimir mesmo assim kk
         criarAluno aluno1 = new criarAluno("",123,15);
         
         System.out.println("o Aluno "+aluno1.getNome()+" da matricula "+aluno1.getMatricula()+" possui a idade de "+aluno1.getIdade());
     
    }
    
}
