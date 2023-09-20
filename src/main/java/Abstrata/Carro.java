/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrata;

/**
 *
 * @author 06985933599
 */
class Carro extends Veiculo{
    String modelo;

    public Carro(String modelo, String marca, String nome, String placa, float velocidade) {
        super(marca, nome, placa, velocidade);
        this.modelo = modelo;
    }

    public Carro() {
        super();
        this.modelo = "";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    float acelerar(){
        this.velocidade++;
        return this.velocidade;
    }
    
    @Override
    float parar(){
        this.velocidade = 0;
        return this.velocidade;
    }

    @Override
    public String toString() {
        String vel = super.toString();
        return vel + "Carro{" + "modelo=" + modelo + '}';
    }
    
    
}
