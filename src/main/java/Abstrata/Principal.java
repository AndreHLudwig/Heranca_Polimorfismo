/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrata;

/**
 *
 * @author 06985933599
 */
public class Principal {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        
        Veiculo carro2 = new Carro("Hatch", "Wolksvagen", "Fox", "Abc123", 0);
        
        carro2.acelerar();
        carro2.toString();
        carro2.parar();
        carro2.toString();
    }
}
