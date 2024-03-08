/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author matheus.oasilva
 */
public class Banco {

    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria("joão", 100);
        
        
        System.out.println("Olá senhor :"+ conta1.getTitular());
        System.out.println(" Seu Saldo inicial:"+ conta1.getSaldo());
        
         conta1.depositar(100);
         
         System.out.println("Senhor "+conta1.getTitular()+" seu novo saldo após depósito é : "+conta1.getSaldo());
         
         conta1.sacar(50);
         System.out.println("Senhor "+conta1.getTitular()+" seu novo saldo após o saque é : "+conta1.getSaldo());
    }
    
   
    
    
}
