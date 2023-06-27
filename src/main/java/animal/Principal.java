/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import java.util.ArrayList;

/**
 *
 * @author 06985933599
 */
public class Principal {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.fala();
       
        Animal cachorro = new Cachorro(); //&123
        cachorro.fala();
        //cachorro.corre(); Não é possível usar o método sem converter;
        
        //Casting - conversão para cachorro;
        Cachorro cachorroConvertido = (Cachorro) cachorro; //&123
        cachorroConvertido.corre();
        
        Animal gato = new Gato();
        gato.fala();
     
        Animal[] animais = new Animal[3];
        animais[0] = animal;
        animais[1] = cachorro;
        animais[2] = gato;
        
        System.out.println("");
        
        for (int i = 0; i < animais.length; i++){
            animais[i].fala();
        }
        System.out.println("");
        
        ArrayList<Animal> animais2 = new ArrayList();
        animais2.add(animal);
        animais2.add(gato);
        animais2.add(cachorro);
        
        for(Animal a: animais){
            a.fala();
            //((Cachorro)a).corre(); não é possível converter pois nem todos animais correm
            if (a instanceof Cachorro){
                ((Cachorro)a).corre();
                System.out.println("correu");
            }
            
        }
        
        Animal cachorroEspecial = new CachorroEspecial();
        cachorroEspecial.fala();
    }
}
