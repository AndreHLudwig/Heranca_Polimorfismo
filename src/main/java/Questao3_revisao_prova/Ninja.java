/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3_revisao_prova;

/**
 *
 * @author 06985933599
 */
public class Ninja {
    private String nome;
    private int Chakra;
    private int kunais;
   

    public Ninja(String nome, int Chakra, int kunais) {
        this.nome = nome;
        this.Chakra = Chakra;
        this.kunais = kunais;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getChakra() {
        return Chakra;
    }

    public void setChakra(int Chakra) {
        this.Chakra = Chakra;
    }

    public int getKunais() {
        return kunais;
    }

    public void setKunais(int kunais) {
        this.kunais = kunais;
    }
    
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
    
    public boolean utilizarPoder (Ninja ninja, int kunais){
        if (kunais <= 5){
            return false;
        } else{
            kunais -= 4;
            ninja.setKunais(kunais);
          return true;
        }
    }

    @Override
    public String toString() {
        return "Ninja{" + "nome=" + nome + ", Chakra=" + Chakra + ", kunais=" + kunais + '}';
    }
    
}
