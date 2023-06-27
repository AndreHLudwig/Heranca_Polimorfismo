/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3_revisao_prova;

import java.util.ArrayList;

/**
 *
 * @author 06985933599
 */
public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Ninja> ninjas = new ArrayList();
        
        Ninja naruto = new Naruto("Rasengan", "Naruto", 100, 10);
        Ninja sasuke = new Sasuke("Chidori", "Sasuke", 90, 15);
        
        naruto.utilizarPoder(naruto);
        sasuke.utilizarPoder(sasuke);
        sasuke.utilizarPoder(sasuke, 8);
        
        System.out.println(naruto);
        System.out.println(sasuke);
        System.out.println("\n" + "Lista de ninjas");
        
        ninjas.add(naruto);
        ninjas.add(sasuke);
        
        naruto.utilizarPoder(naruto);
        
        for (Ninja n: ninjas){
            System.out.println(n);
        }
    }
}
