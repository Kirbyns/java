/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;


public class ContaBancaria {
    private String titular;
    
    private double saldo;
    
    
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this. saldo = saldo; 
}

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public void depositar(double valor){
        saldo +=valor; // metodo para depositar valor
    }
    public void sacar (double valor){
        saldo -=valor; //metodo para 
    }
}


