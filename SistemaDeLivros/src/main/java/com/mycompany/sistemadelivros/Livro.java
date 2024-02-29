/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadelivros;

/**
 *
 * @author matheus.oasilva
 */
public class Livro {
    
    private String titulo;
    private String autor;
    
public Livro (String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;

}

public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
   

    
}
