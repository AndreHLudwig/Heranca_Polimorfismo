/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao7_revisao_prova;

/**
 *
 * @author andre
 */
public class Aluno extends Pessoa{
    private float nota;

    public Aluno(float nota, String nome, int idade) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public String toString() {
        String pessoa = super.toString();
        return pessoa + "\nAluno " + "\nNota: " + nota;
    }
    
}
