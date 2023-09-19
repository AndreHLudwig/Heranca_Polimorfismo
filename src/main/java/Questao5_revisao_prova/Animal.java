/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5_revisao_prova;

/**
 *
 * @author andre
 */
public class Animal {
    private String nome;
    private int comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidade;
    
    public Animal (String nome, String cor, String ambiente, int comprimento, float velocidade, int patas){
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.numeroDePatas = patas;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void sePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return """
               -------------
               Animal: """ + nome + "\n" + "Comprimento: " + comprimento + " cm" + "\n"+ 
               "Patas: " + numeroDePatas + "\n" + "Cor: " + cor + "\n" + "Ambiente: " + ambiente + "\n"+
               "Velocidade: " + velocidade + " m/s";
        
    }
    
    
}
