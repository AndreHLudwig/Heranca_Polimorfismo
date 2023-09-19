/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1_revisao_prova;

/**
 *  Q1 - Explique o que são modificadores de visibilidade em Java e
         demonstre o uso dos modificadores através de um exemplo.
 * @author andre
 */
public class mod_visibilidade {
    /* O modificador private faz com que o atributo/método esteja visível 
        apenas para o objeto dono do atributo/método. Consequentemente,
        apenas dentro do código fonte da classe é que podemos programar
        algum acesso/atribuição a um atributo privado ou
        ativar um método privado.

       O modificador protected faz com que o atributo/método esteja visível 
        para o objeto dono e também para objetos de subclasses. 
        
       O modificador public faz com que o atributo/método esteja visível
        para o objeto dono do atributo/método e também para qualquer 
        outro objeto existente no sistema.
    */
    private String nome;
    protected String apelido;
    public float altura;

    public mod_visibilidade(String nome, String apelido, float altura) {
        this.nome = nome;
        this.apelido = apelido;
        this.altura = altura;
    }

    private String setNome(String nome) {
        return nome;
    }

    protected void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        String nomeAlterado = setNome("Nome setado");
        return """
               ----
               mod_visibilidade: 
               Nome: """ + nomeAlterado + "\nApelido: " + apelido + "\nAltura: " + altura;
    }

    
}