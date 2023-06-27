/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.ArrayList;

/**
 *
 * @author 06985933599
 */
public class Professor extends Pessoa{
    private String dataAdmissao;
    private ArrayList<String> disciplinas;

    public Professor(String nome, String dataNascimento, String CPF, String dataAdmissao) {
        super(nome, dataNascimento, CPF);
        this.dataAdmissao = dataAdmissao;
        disciplinas = new ArrayList();
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    
}
