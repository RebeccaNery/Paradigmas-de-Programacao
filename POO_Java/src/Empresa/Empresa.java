package Empresa;

public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;
    private int numFuncionarios;

    public Empresa(String nome, String cnpj, int numFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new Funcionario[numFuncionarios];
        this.numFuncionarios = 0;
    }

    public void contratarFuncionario(Funcionario func) {
        if (numFuncionarios < funcionarios.length) {
            funcionarios[numFuncionarios] = func;
            numFuncionarios++;
        } else {
            System.out.println("Não foi possível contratar o(a) funcionário(a). Número máximo de funcionários atingido.");
        }
    }

    public void exibirInfo() {
        System.out.println(">>> Dados da Empresa >>>");
        System.out.println("- Nome: " + this.nome);
        System.out.println("- CNPJ: " + this.cnpj);
        System.out.println("- Funcionários:");
        for (Funcionario func : funcionarios) {
            if (func != null) {
                func.exibirInfo();
            }
        }
        System.out.println("------------------------------------------------");
    }
}
