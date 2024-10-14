package somarProdutos;

public class Produto {
    private String nome;
    private double preco;

    // Construtor da classe Produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método de conveniência para somar dois produtos com base no preço
    public Produto somar(Produto outroProduto) {
        // Criar um novo produto com o preço somado
        double precoSomado = this.preco + outroProduto.preco;
        String novoNome = this.nome + " & " + outroProduto.nome; // Opcional: Nome combinado
        return new Produto(novoNome, precoSomado);
    }

    // Getters para acessar o nome e o preço
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Sobrescrevendo o método toString para facilitar a impressão dos objetos
    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + preco;
    }
}
