/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1_revisao_prova;

/**
 *
 * @author andre
 */
public class teste extends mod_visibilidade{
    private String teste;

    public teste(String teste, String nome, String apelido, float altura) {
        super(nome, apelido, altura);
        this.teste = teste;
    }

    @Override
    public String toString() {
        String superior = super.toString();
        return superior + "\nTeste: " + teste;
    }
    
    
    
}
