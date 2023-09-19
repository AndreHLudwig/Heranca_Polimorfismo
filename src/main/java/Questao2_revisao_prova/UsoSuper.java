/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2_revisao_prova;
/**
 *
 * @author andre
 */
public class UsoSuper {
    /*
    Super
    
    Nas subclasses, a palavra reservada super serve para executar a "versão original" de  
    algum método da superclasse que foi sobrescrito. Geralmente é usado no toString() para
    obter a representação textual com os dados genéricos da superclasse evitando a repetição de códigos.
    
    Se a superclasse tiver o método Construtor, obrigatoriamente as subclasses também dever o método Construtor.
    Assim as subclasses devem ativar o construtor da superclasse como sua primeira instrução, fazemos isso para 
    garantir consistência. Dentro do construtor usamos a palavra super para importar o que é genérico ao sistema, 
    proveniente da superclasse e os parâmetros são passados dentro de parentesis.
    
    O polimorfismo é um recurso da Orientação a Objetos em programação que permite tratar um objeto
    específico de uma forma mais geral, usando variáveis polimórficas. Uma variável polimórfica pode
    conter objetos de diferentes tipos durante a execução do sistema.
    */
    
    /*
    Resumo dos Benefícios da Herança
        > Evita duplicação de código.
        > Extensibilidade: é mais fácil estender o sistema existente.
        > Facilita a manutenção do software: alterações apenas na superclasse.
        > O polimorfismo simplifica os programas, permitindo que objetos sejam tratados de
            modo mais genérico.
        > A sobrescrita permite que uma subclasse customize métodos.
        > O polimorfismo de métodos escolhe dinamicamente o método sobrescrito que será
            executado de acordo com o tipo dinâmico.
    */
    
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
    
    /*
    Resumindo, a sobrecarga de métodos é usada para fornecer diferentes formas
    de chamar o mesmo método com diferentes parâmetros, enquanto a sobrescrita
    de métodos permite que as subclasses substituam a implementação dos
    métodos da superclasse para fornecer um comportamento específico.
    */
}
