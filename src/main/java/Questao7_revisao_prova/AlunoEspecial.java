/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao7_revisao_prova;

/**
 *
 * @author andre
 */
public class AlunoEspecial extends Aluno{

    public AlunoEspecial(float nota, String nome, int idade) {
        super(nota, nome, idade);
    }

    @Override
    public String toString() {
        String pessoa = super.toString();
        return pessoa + "\nAlunoEspecial";
    }
    
}
