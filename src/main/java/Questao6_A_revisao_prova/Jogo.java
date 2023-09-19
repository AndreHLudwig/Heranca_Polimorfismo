/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6_A_revisao_prova;

/**
 *
 * @author andre
 */
public class Jogo extends Item{
   private int jogadores;
   private String plataforma;

    public Jogo(int jogadores, String plataforma, String titulo, double duracao, String comentario) {
        super(titulo, duracao, comentario);
        this.jogadores = jogadores;
        this.plataforma = plataforma;
    }

    public int getJogadores() {
        return jogadores;
    }

    public void setJogadores(int jogadores) {
        this.jogadores = jogadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Jogo: " + getTitulo() + ", Jogadores: " + jogadores + ", plataforma: " + plataforma + ", Comentário: " + getComentario();
    }
   
   
}
