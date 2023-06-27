/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filme;

/**
 *
 * @author 06985933599
 */
public class Album extends Item{
    private String artista;
    private int faixas;

    public Album(String titulo, double duracao, String comentario, String artista, int faixas) {
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
        String retorno = super.toString() + "Album{" + "artista=" + artista + ", faixas=" + faixas + '}';
        return retorno; 
    }
    
    
}
