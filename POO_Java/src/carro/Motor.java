package carro;

public class Motor {

    private int potencia;
    private String tipoCombustivel;

    // Construtor da classe Motor
    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    // Método para exibir os detalhes do motor
    public void exibirDetalhes() {
        System.out.println("MOTOR ====> ");
        System.out.println("Potência: " + potencia + ", Combustível: " + tipoCombustivel);
    }

}
