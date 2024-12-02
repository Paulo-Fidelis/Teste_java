package cadastrousuario;

public abstract class usuario {
    private String nome;
    private String cpf;
    private int idade;
    private String email_pessoal;
    private String email_institucional;
    private String senha;

    usuario(String nome, String cpf, int idade, String email_pessoal, String email_institucional, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.email_pessoal = email_pessoal;
        this.email_institucional = email_institucional;
        this.senha = senha;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail_pessoal() {
        return this.email_pessoal;
    }

    public void setEmail_pessoal(String email_pessoal) {
        this.email_pessoal = email_pessoal;
    }

    public String getEmail_institucional() {
        return this.email_institucional;
    }

    public void setEmail_institucional(String email_institucional) {
        this.email_institucional = email_institucional;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public abstract String validaEmailInstitucional(String validaEmailInstitucional);
}