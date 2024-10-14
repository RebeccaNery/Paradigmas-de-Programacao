package funcAbstrato;

public class FuncHorista extends FuncionarioAbstrato {
    private double salarioHora;
    private double horasTrabalhadas;

    public FuncHorista(String nome, double salarioHora, double horasTrabalhadas) {
        super(nome);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario() {
        System.out.println("Salário de " + this.getNome() + ": R$ " + this.salarioHora * this.horasTrabalhadas);
        return this.salarioHora * this.horasTrabalhadas;
    }
}
