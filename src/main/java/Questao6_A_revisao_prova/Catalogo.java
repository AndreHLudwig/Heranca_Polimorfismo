/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6_A_revisao_prova;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Catalogo {
    private String colecionador;
    ArrayList<Item> itens = new ArrayList<Item>();

    public Catalogo(String colecionador) {
        this.colecionador = colecionador;
    }
    
    public String Catalago(String colecionador){
       return colecionador;
    }
    
    private String getItens(){
        String lista = "";
        for(Item i: itens){
            lista += i.toString() + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Catálogo: " + "Colecionador: " + colecionador + "\nItens: " + "\n" + getItens();
    }
    
    
}
