package escola;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private String disciplina;
    private List<Escola> escolas;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.escolas = new ArrayList<Escola>();
    }

    public void associarEscola(Escola esc) {
        escolas.add(esc);
    }

    public void exibirInfo() {
        System.out.println(">>> Dados do(a) Professor(a) >>>");
        System.out.println("- Nome: " + this.nome);
        System.out.println("- Disciplina: " + this.disciplina);
        System.out.println("- Escolas associadas:");
        for (Escola escola : escolas) {
            escola.exibirInfo();
        }
        System.out.println("------------------------------------------------");
    }
}
