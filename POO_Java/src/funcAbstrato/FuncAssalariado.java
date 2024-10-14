package funcAbstrato;

public class FuncAssalariado extends FuncionarioAbstrato {
    private double salarioMensal;

    public FuncAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        System.out.println("Salário mensal de " + this.getNome() + ": R$ " + this.salarioMensal);
        return this.salarioMensal;
    }
}
