package Empresa;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirInfo() {
        System.out.println(">>> Dados do(a) Funcionário(a) >>>");
        System.out.println("- Nome: " + this.nome);
        System.out.println("- Cargo: " + this.cargo);
        System.out.println("- Salário: R$ " + this.salario);
        System.out.println("------------------------------------------------");
    }
}
