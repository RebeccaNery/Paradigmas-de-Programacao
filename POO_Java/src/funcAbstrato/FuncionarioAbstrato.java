package funcAbstrato;

public abstract class FuncionarioAbstrato {
    protected String nome;

    public FuncionarioAbstrato(String nome) {
        this.nome = nome;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }
}
