/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5_revisao_prova;

/**
 *
 * @author andre
 */
public class Peixe extends Animal{
    private String caracteristica;

    public Peixe(String nome,String caracteristica, String cor, String ambiente, int comprimento, float velocidade, int patas) {
        super(nome, "Cinzenta", "Mar", comprimento, velocidade, 0);
        this.caracteristica = "Barbatanas e cauda";
    }
    
    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }
    public String getCaracteristica(){
        return this.caracteristica;
    }

    @Override
    public String toString() {
        String animal = super.toString();
        
        return animal + "\nCaracteristica: " + caracteristica;
    }
    
    
}

