package cadastrousuario;

public class professor extends usuario {
    private String siape;
    private String area_formacao;
    private String nivel_instrucao;
    professor(String nome, String cpf, int idade, String email_pessoal, String email_institucional, String senha, String siape, String area_formacao, String nivel_instrucao){
        super(nome,cpf,idade,email_pessoal,email_institucional,senha);
        this.siape = siape;
        this.area_formacao = area_formacao;
        this.nivel_instrucao = nivel_instrucao;
    }

    public String getSiape() {
        return this.siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String getArea_formacao() {
        return this.area_formacao;
    }

    public void setArea_formacao(String area_formacao) {
        this.area_formacao = area_formacao;
    }

    public String getNivel_instrucao() {
        return this.nivel_instrucao;
    }

    public void setNivel_instrucao(String nivel_instrucao) {
        this.nivel_instrucao = nivel_instrucao;
    }

    public String validaEmailInstitucional(String validaEmailInstitucional){
        if(validaEmailInstitucional.contains("discente.ifpe.edu.br")){
            return validaEmailInstitucional;
        }else{
            return "";
        }
    }
}
