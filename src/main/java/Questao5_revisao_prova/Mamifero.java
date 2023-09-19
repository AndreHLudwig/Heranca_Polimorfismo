/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5_revisao_prova;

/**
 *
 * @author andre
 */
public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String alimento, String nome, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        super(nome, cor, "Terra", comprimento, velocidade, 4);
        this.alimento = alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    @Override
    public String toString() {
        String animal = super.toString();
        
        return animal +
               "\nAlimento: " + alimento;
    }
    
    
}
