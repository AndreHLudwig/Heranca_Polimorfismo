/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1_revisao_prova;

/**
 *
 * @author andre
 */
public class principal {
    public static void main(String[] args) {
        mod_visibilidade m1 = new mod_visibilidade("eu", "I", 1f);
        m1.setApelido("Apelido");
        System.out.println(m1.toString());
        
        System.out.println(m1.getAltura());
        
        //Em resumo, a sobrecarga de métodos envolve a definição de vários métodos com o mesmo nome,
        //mas com assinaturas diferentes, enquanto a sobrescrita de métodos ocorre quando uma classe
        //filha redefine um método da classe pai com sua própria implementação. 
        //Ambos os conceitos são úteis na programação orientada a objetos e são aplicados em 
        //diferentes situações para melhorar a flexibilidade, a reutilização de código e a expressividade.
        
    }
}
