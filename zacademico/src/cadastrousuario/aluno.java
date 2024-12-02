package cadastrousuario;

import java.util.ArrayList;

public class aluno extends usuario{
    private String matricula;
    private escola escolaanterior;
    private ArrayList<notaselecao> nostasSelecao;

    public aluno(String nome, String cpf, int idade, String email_pessoal, String email_institucional, String senha, String matricula){
        super(nome,cpf,idade,email_pessoal,email_institucional,senha);
        this.matricula = matricula;
    }


    public escola getEscolaanterior() {
        return this.escolaanterior;
    }

    public void setEscolaanterior(escola escolaanterior) {
        this.escolaanterior = escolaanterior;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public ArrayList<notaselecao> getNostasSelecao() {
        return this.nostasSelecao;
    }

    public void setNostasSelecao(ArrayList<notaselecao> nostasSelecao) {
        this.nostasSelecao = nostasSelecao;
    }
    

    public String validaEmailInstitucional(String email_institucional){
        if(email_institucional.contains("discente.ifpe.edu.br")){
            return email_institucional;
        }else{
            return "";
        }
    }
}
