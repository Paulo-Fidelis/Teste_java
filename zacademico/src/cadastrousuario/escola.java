package cadastrousuario;

public class escola {
    private String nome;
    private String id_mec;
    private String endereco;
    private int ano_conclusao;
    private String contato;
    
    


    public escola(String nome, String id_mec, String endereco, int ano_conclusao, String contato) {
        this.nome = nome;
        this.id_mec = id_mec;
        this.endereco = endereco;
        this.ano_conclusao = ano_conclusao;
        this.contato = contato;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId_mec() {
        return this.id_mec;
    }

    public void setId_mec(String id_mec) {
        this.id_mec = id_mec;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAno_conclusao() {
        return this.ano_conclusao;
    }

    public void setAno_conclusao(int ano_conclusao) {
        this.ano_conclusao = ano_conclusao;
    }

    public String getContato() {
        return this.contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }


    
}
