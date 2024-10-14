package escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private String endereco;
    private List<Professor> professores;

    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.professores = new ArrayList<Professor>();
    }

    public void associarProfessor(Professor prof) {
        professores.add(prof);
        //System.out.println("Professor " + prof.nome() + " associado à escola " + this.nome);
    }

    public void exibirInfo() {
        System.out.println(">>> Dados da Escola >>>");
        System.out.println("- Nome: " + this.nome);
        System.out.println("- Endereço: " + this.endereco);
        System.out.println("- Professores associados:");
        for (Professor prof : professores) {
            prof.exibirInfo();
        }
        System.out.println("------------------------------------------------");
    }
}
