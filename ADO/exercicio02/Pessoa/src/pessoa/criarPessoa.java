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
public class criarPessoa {
    
    private int idade;
    private String nome;
    
     public criarPessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade; 
    
     }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     
}
