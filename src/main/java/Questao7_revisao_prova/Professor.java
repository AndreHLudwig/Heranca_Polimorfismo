/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao7_revisao_prova;

/**
 *
 * @author andre
 */
public class Professor extends Pessoa{
    private float salario;

    public Professor(float salario, String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
    }

    @Override
    public String toString() {
        String pessoa = super.toString();
        return pessoa + "\nProfessor " + "\nSalario: " + salario;
    }
    
    
}
