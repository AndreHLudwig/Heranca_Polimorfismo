/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

/**
 *
 * @author 06985933599
 */
public class Aluno extends Pessoa{
   private String matricula;
   private String emailInstitucional;

    public Aluno(String nome, String dataNascimento, String CPF, String matricula, String emailInstitucional) {
        super(nome, dataNascimento, CPF);
        this.matricula = matricula;
        this.emailInstitucional = emailInstitucional;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }
}
