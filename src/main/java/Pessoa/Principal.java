/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

/**
 *
 * @author 06985933599
 */
public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Aluno();
        Pessoa a = new Pessoa();
        
        System.out.println( p.toString());
        
        //Object a = new Aluno();
        
        ((Aluno)a).getMatricula();
    }
}
