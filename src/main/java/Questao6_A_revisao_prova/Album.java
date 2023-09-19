/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6_A_revisao_prova;

/**
 *
 * @author andre
 */
public class Album extends Item{
    private String artista;
    private int faixas;

    public Album(String artista, int faixas, String titulo, double duracao, String comentario) {
        super(titulo, duracao, comentario);
        this.artista = artista;
        this.faixas = faixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    @Override
    public String toString() {
        return "Album: " + getTitulo() + ", Artista: " + artista + ", Faixas: " + faixas + ", Comentário: " + getComentario();
    }
    
    
}
