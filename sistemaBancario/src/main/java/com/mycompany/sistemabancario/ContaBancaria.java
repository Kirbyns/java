/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author matheus.oasilva
 */
public class ContaBancaria {
     private String titular;
    private double saldo;
    
    
     public ContaBancaria(String titular,double saldo) {
         this.titular = titular;
         this.saldo = saldo;
     }
     
     public String getTitular(){
         return titular;
     }
     public double getSaldo(){
         return saldo;
     }
    
}
