package cadastrousuario;

public interface instituicao {
    public String nome;
    public String endereco;
    public String cnpj;

    public void printInfo();
    public String validaIdMec();
}
