/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

/**
 *
 * @author matheussilva
 */
public class Livro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        criarLivro livro1 = new criarLivro("autor","titulo");//settando na criação
        
        livro1.setAutor("fulano de tal"); // alterando de brincadeirinha
        livro1.setTitulo("setembro verde, uma historia da natureza");
        
        System.out.println(" Livro: "+livro1.getTitulo()+" do autor(a): "+livro1.getAutor());
    }
    
}
