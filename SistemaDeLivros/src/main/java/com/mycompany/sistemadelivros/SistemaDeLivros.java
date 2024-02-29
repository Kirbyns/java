/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadelivros;

/**
 *
 * @author matheus.oasilva
 */
public class SistemaDeLivros {

    public static void main(String[] args) {
        
        Livro livro1 = new Livro("O Mito de Sisifo", "Albert Camus");
        
        System.out.println("nome do livro: "+livro1.getTitulo());
        System.out.println("nome do autor: "+livro1.getAutor());
}

}