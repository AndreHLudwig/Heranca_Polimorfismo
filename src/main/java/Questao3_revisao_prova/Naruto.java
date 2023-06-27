/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3_revisao_prova;

/**
 *
 * @author 06985933599
 */
public class Naruto extends Ninja{
    private String poder;

    public Naruto(String poder, String nome, int Chakra, int kunais) {
        super(nome, Chakra, kunais);
        this.poder = poder;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
    
    @Override
    public boolean utilizarPoder (Ninja ninja){
        int chakra = ninja.getChakra();
        
        if (chakra <= 10){
            return false;
        } else{
            chakra -= 15;
            ninja.setChakra(chakra);
          return true;
        }
    }

    @Override
    public String toString() {
        String desc = super.toString();
        return desc + " tem o poder: " + poder + '}';
    }
        
}
