import java.util.ArrayList;

import cadastrousuario.aluno;
import cadastrousuario.escola;
import cadastrousuario.notaselecao;

public class App {
    public static void main(String[] args) throws Exception {
        aluno aluno1 = new aluno("Maria","0123456789",15,"mariasilva@gmail.com","ms67@ifpe.edu.br","12435", "TDS20240532");

        escola escolafundamental = new escola("Juse", "123was", "huhuhu", 5816942, "2131762");

        aluno1.setEscolaanterior(escolafundamental);


        ArrayList<notaselecao> notasSel = new ArrayList<notaselecao>();

        notaselecao notaport = new notaselecao("Portugues", 8.54, false);
        notaselecao notamat = new notaselecao("Matematica", 5, true);
        notaselecao notageo = new notaselecao("Geografia", 10, true);

        notasSel.add(notaport);
        notasSel.add(notamat);
        notasSel.add(notageo);

        aluno1.setNostasSelecao(notasSel);

        System.out.println(aluno1.getNome());
    }
}
