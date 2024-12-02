package cadastrousuario;

public class notaselecao {
    private String disciplina;
    private double nota;
    private boolean eja;


    public notaselecao(String disciplina, double nota, boolean eja) {
        this.disciplina = disciplina;
        this.nota = nota;
        this.eja = eja;
    }


    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isEja() {
        return this.eja;
    }

    public boolean getEja() {
        return this.eja;
    }

    public void setEja(boolean eja) {
        this.eja = eja;
    }

}
