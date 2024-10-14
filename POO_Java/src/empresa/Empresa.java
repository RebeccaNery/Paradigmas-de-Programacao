package empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj, int numFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void contratarFuncionario(Funcionario func) {
        funcionarios.add(func);
    }

    public void exibirInfo() {
        System.out.println(">>> Dados da empresa >>>");
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
