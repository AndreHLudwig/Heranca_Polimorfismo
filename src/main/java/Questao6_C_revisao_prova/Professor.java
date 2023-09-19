/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6_C_revisao_prova;

/**
 *
 * @author andre
 */
public class Professor extends Pessoa{

    public Professor(String nome, String email) {
        super(nome, email);
    }
   
    @Override
    public String getEmail(){
        return email;
    }
}
