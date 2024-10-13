package carro;

public class CarroComMotor {

    private String marca;
    private String modelo;
    private Motor motor;  // Atributo da classe Motor

    // Construtor da classe CarroComMotor
    public CarroComMotor(String marca, String modelo, int potencia, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(potencia, tipoCombustivel);  // Instanciando um objeto da classe Motor
    }

    // Método para exibir os detalhes do carro
    public void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo);
        motor.exibirDetalhes();  // Exibindo os detalhes do motor associado
    }



}
