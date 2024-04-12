/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author matheussilva
 */
public class Pessoa {

    public static void main(String[] args) {
         criarPessoa pessoa1 = new criarPessoa("Matheu", 28); //setando na criação
         criarPessoa pessoa2 = new criarPessoa("",1); //setando na criação
           pessoa2.setNome("Novonome"); //modificando nome por Setters 
           pessoa2.setIdade(22); // setando agora a idade
    }
    
}
