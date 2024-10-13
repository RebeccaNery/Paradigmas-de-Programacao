package escola;

public class Escola {
    private String nome;
    private String endereco;

    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
    }
}
