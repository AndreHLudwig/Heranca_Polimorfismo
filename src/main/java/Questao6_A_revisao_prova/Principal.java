/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao6_A_revisao_prova;

/**
 *
 * @author andre
 */
public class Principal {
    public static void main(String[] args) {
        
        
        Catalogo novoCatalogo = new Catalogo("André");
        
        Item classicas = new Album("Lenon", 12, "Clássicas", 70.5, "Velha Guarda");
        Item vf10 = new Filme("Richard", "Velozes e Furiosos", 90.2, "Ação");
        Item gta = new Jogo(3, "Desktop", "Grand Theft Auto", 30, "Tiro e Ação");
        
       
        novoCatalogo.itens.add(gta);
        novoCatalogo.itens.add(vf10);
        novoCatalogo.itens.add(classicas);
        
        System.out.println(novoCatalogo);
    }
}
