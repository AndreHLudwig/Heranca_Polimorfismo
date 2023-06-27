/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filme;

/**
 *
 * @author 06985933599
 */
public class Principal {
    public static void main(String[] args) {
        Album cd1 = new Album("Chora me Liga" , 50.5, "Sertanejo Raiz" , "Zé da Viola", 16);
        Filme panico2 = new Filme("panico", 142, "Terror", "John Elvin");
        
        System.out.println(cd1);
        System.out.println("");
        System.out.println(panico2);
        
    }
}
