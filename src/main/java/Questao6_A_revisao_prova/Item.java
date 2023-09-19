/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6_A_revisao_prova;

/**
 *
 * @author andre
 */
public class Item {
    private String titulo;
    private double duracao;
    private String comentario;

    public Item(String titulo, double duracao, String comentario) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Item: " + "titulo: " + titulo + ", duracao: " + duracao + ", comentario: " + comentario + '}';
    }
    
    
}
