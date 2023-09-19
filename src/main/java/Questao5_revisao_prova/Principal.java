/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao5_revisao_prova;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList();
        
        Animal camelo = new Animal("Camelo", "Amarelo", "Terra", 150, 2.0f, 4);
        Peixe tubarao = new Peixe("Tubarão", "Barbatanas e cauda", "Cinzento", "Oceano", 300, 1.5f, 0);
        Mamifero urso = new Mamifero("Mel", "Urso-do-canadá", "Vermelho", "Terra", 180, 0.5f, 4);
        
        zoo.add(camelo);
        zoo.add(tubarao);
        zoo.add(urso);
        
        System.out.println("Zoo:");
        
        for (Animal a: zoo){
            System.out.println(a.toString());
        }
      
    }
}
