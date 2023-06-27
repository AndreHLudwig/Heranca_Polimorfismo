/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4_revisao_prova;

/**
 *
 * @author 06985933599
 */
public class ContaEspecial extends ContaBancaria{
    private float limite;

    public ContaEspecial(float limite, String cliente, int numeroConta, float saldo) {
        super(cliente, numeroConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public float getSaldo() {
        return saldo;
    }
    
    @Override
     public boolean sacar(float valor){
        if(this.saldo - valor < this.limite){
            System.out.println("Não foi possível sacar");
            return false;
        } else {
            System.out.println("Saque realizado com sucesso");
            this.saldo -= valor;
            return true;
        }       
    }
    
}
