/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filme;

/**
 *
 * @author 06985933599
 */
public class Filme extends Item{
    private String diretor;

    public Filme(String titulo, double duracao, String comentario, String diretor) {
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
        String retorno = super.toString() + "Filme{" + "diretor=" + diretor + '}';;
        return retorno;
    }
    
    
}
