/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6_A_revisao_prova;

/**
 *
 * @author andre
 */
public class Filme extends Item{
    private String diretor;

    public Filme(String diretor, String titulo, double duracao, String comentario) {
        super(titulo, duracao, comentario);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme: " + getTitulo() + ", Diretor: " + diretor + ", Comentário: " + getComentario();
    }
    
}
