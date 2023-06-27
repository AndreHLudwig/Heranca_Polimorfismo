/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4_revisao_prova;

/**
 *
 * @author 06985933599
 */
public class ContaBancaria {
    private String cliente;
    private int numeroConta;
    protected float saldo;

    public ContaBancaria(String cliente, int numeroConta, float saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
        
    public boolean sacar(float valor){
        if(this.saldo < valor){
           System.out.println("Não foi possível sacar"); 
           return false;
        } else {
            System.out.println("Saque realizado com sucesso");
            this.saldo -= valor;
            return true;
        }       
    }
    
    public boolean depositar(float valor){
        this.saldo += valor;
        System.out.println("Depósito realizado");
        return true;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "cliente=" + cliente + ", numeroConta=" + numeroConta + ", saldo=" + saldo + '}';
    }
    
    
}
