/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

/**
 *
 * @author matheussilva
 */
public class criarLivro {
    private String tombo;
    private String editora;
    
    
    //construtorzinho bala
    
    public criarLivro(String tombo, String editora){
        this.editora = editora;
        this.tombo = tombo;
    }

    public String getTombo() {
        return tombo;
    }

    public void setTombo(String tombo) {
        this.tombo = tombo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
}
