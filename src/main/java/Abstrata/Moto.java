/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrata;

/**
 *
 * @author 06985933599
 */
class Moto extends Veiculo{
    String tipo;

    public Moto(String tipo, String marca, String nome, String placa, float velocidade) {
        super(marca, nome, placa, velocidade);
        this.tipo = tipo;
    }

    public Moto() {
        super();
        this.tipo = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    float acelerar(){
        this.velocidade += 5;
        return this.velocidade;
    }
    
    @Override
    float parar(){
        this.velocidade = 0;
        return this.velocidade;
    }

    @Override
    public String toString() {
        String sup = super.toString();
        return sup + "Moto{" + "tipo=" + tipo + '}';
    }

   
}
