/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4_revisao_prova;

/**
 *
 * @author 06985933599
 */
public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String cliente, int numeroConta, float saldo) {
        super(cliente, numeroConta, saldo);
    }

    public float getSaldo() {
        return saldo;
    }
    
        
    public boolean calcularRendimento(float taxa){
        this.saldo += (saldo*(taxa/100));
        return true;
    }
}
