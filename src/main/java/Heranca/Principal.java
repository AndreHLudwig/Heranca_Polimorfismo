/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author 06985933599
 */
public class Principal {
    public static void main(String[] args) {
                 
        Pessoa pessoa = new Pessoa("Joaquim", "15/05/1888", "1");
        pessoa.getNome();
        
        
        Aluno aluno = new Aluno("Aluno 1", "01/01/2010", "2", "", "email@aluno.com");
        aluno.getNome();
        aluno.getMatricula();
         
                
        Professor professor = new Professor("Professor 1", "24/04/1991", "3", "18/02/2023");
        professor.getNome();
        professor.getDataAdmissao();
        
        System.out.println(pessoa.toString());
    }
    
    
}
