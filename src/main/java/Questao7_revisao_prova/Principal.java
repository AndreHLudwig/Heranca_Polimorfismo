/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao7_revisao_prova;

/**
 *
 * @author andre
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Aluno(10, "André", 26);
        System.out.println(p1);
        Pessoa p2 = new AlunoEspecial(9, "Marcelo", 30);
        System.out.println(p2);
        //AlunoEspecial ae1 = new Aluno();
        //Professor pf1 = new Pessoa();
        Pessoa p3 = new Professor(8000f, "Matheus", 32);
        System.out.println(p3);
        Aluno a1 = new AlunoEspecial(10, "João", 29);
        System.out.println(a1);
        Object o1 = new Professor(10000f, "Paolo", 35);
        System.out.println(o1);
    }
}
