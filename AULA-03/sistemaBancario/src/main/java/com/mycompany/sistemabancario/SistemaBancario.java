/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabancario;

/**
 *
 * @author matheus.oasilva
 */
public class SistemaBancario {

    public static void main(String[] args) {
        
        
        ContaBancaria titular1 = new ContaBancaria("Matheus",2324);
        
        //testando setters
        titular1.setTitular("matheuzinho");
        titular1.setSaldo(20.0);
        
        //testando getters
        System.out.println("nome do Titular: "+titular1.getTitular());
        
        System.out.println("saldo do Titular: "+titular1.getSaldo());

    }
}
