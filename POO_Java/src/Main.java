import animais.Cachorro;
import animais.Gato;
import carro.Carro;
import carro.CarroComMotor;
import carro.Motor;
import contaBancaria.ContaBancaria;
import animais.Animal;

public class Main {
    public static void main(String[] args) {

        // ----------------------------------------- CARRO ------------------------------------------

//        Carro carro1 = new Carro("Audi", "A4", 2006); //Instanciando objeto da classe Carro
//        carro1.exibeInfo(); // Exibindo suas informações
//        carro1.acelerar(100);
//        carro1.freiar(80);
//        carro1.exibeVel();

        // ----------------------------------------- CONTA BANCARIA ------------------------------------------

//        ContaBancaria conta1 = new ContaBancaria(1800.93, "Rebecca Nery");
//        conta1.exibeInfo();
//        conta1.depositar(200.87);
//        conta1.sacar(300);

        // ----------------------------------------- ANIMAIS ------------------------------------------

//        Animal animal1 = new Animal("Mamífero", "Coelho", "Rosa");
//        Animal animal2 = new Animal("Ave", "Papagaio", "Verde");
//        Animal animal3 = new Animal("Peixe", "Tubarão", "Cinza");
//        animal3.fazerSom();
//
//        Animal gato1 = new Gato("Mamífero", "Mushu", "Laranja");
//        Animal cachorro1 = new Cachorro("Mamífero", "Antônio", "Caramelo");
//        gato1.exibeInfo();
//        cachorro1.exibeInfo();
//        gato1.fazerSom();
//        cachorro1.fazerSom();

        // ----------------------------------------- CARRO E MOTOR  ------------------------------------------

        CarroComMotor carroMotor1 = new CarroComMotor("Fiat", "Uno", 1, "Flex");
        carroMotor1.exibirDetalhes();

        // ----------------------------------------- PROFESSOR E ESCOLA  ------------------------------------------


    }//metodo main
}// classe Main