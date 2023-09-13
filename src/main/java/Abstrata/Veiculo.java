/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrata;

/**
 *
 * @author 06985933599
 */
abstract class Veiculo {
    String marca;
    String nome;
    String placa;
    float velocidade;

    public Veiculo(String marca, String nome, String placa, float velocidade) {
        this.marca = marca;
        this.nome = nome;
        this.placa = placa;
        this.velocidade = velocidade;
    }

    public Veiculo() {
        this.marca = "";
        this.nome = "";
        this.placa = "";
        this.velocidade = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    
    abstract float acelerar();
    
    abstract float parar();
    

    @Override
    public String toString() {
        return "Veiculo{" + "marca=" + marca + ", nome=" + nome + ", placa=" + placa + ", velocidade=" + velocidade + '}';
    }
    
    
    

}


