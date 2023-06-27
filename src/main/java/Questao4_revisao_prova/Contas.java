/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4_revisao_prova;

/**
 *
 * @author 06985933599
 */
public class Contas {
    public static void main(String[] args) {
        ContaBancaria conta2 = new ContaPoupanca("Andre", 123, 2000);
        ContaBancaria conta3 = new ContaEspecial(-100, "Kleber", 778, 500);
        
        conta2.sacar(1500.5f);
        conta3.sacar(550f);
        
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());
        
        conta2.depositar(100.5f);
        conta3.depositar(250f);
        
        System.out.println(conta2.toString());
        System.out.println(conta3.toString());
        
        ContaPoupanca contaConvert = (ContaPoupanca) conta2;
        
        
        System.out.println(contaConvert.toString());
        contaConvert.calcularRendimento(10);
        
        System.out.println(contaConvert.toString());
    }
}
