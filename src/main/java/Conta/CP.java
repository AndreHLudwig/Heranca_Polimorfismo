/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conta;

import ContaCorrente.CC;

/**
 *
 * @author 06985933599
 */
public class CP extends CC{
    
    @Override
    public void saque(float valor){
        if (saldo - valor <0){
            saldo = saldo;
            System.out.println("Operação não permitida");
        }else{
            saldo -= valor;
        }
    }
}
