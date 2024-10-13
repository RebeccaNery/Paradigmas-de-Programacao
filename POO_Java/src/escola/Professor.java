package escola;

public class Professor {
    private String nome;
    private String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Disciplina: " + this.disciplina);
    }
}
