import Empresa.Empresa;
import Empresa.Funcionario;
import animais.Cachorro;
import animais.Gato;
import carro.Carro;
import carro.CarroComMotor;
import carro.Motor;
import contaBancaria.ContaBancaria;
import animais.Animal;
import escola.Professor;
import escola.Escola;

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

//        CarroComMotor carroMotor1 = new CarroComMotor("Fiat", "Uno", 1, "Flex");
//        carroMotor1.exibirDetalhes();

        // ----------------------------------------- PROFESSOR E ESCOLA  ------------------------------------------

//        Professor professor1 = new Professor("Rebecca", "Matemática");
//        Professor professor2 = new Professor("João", "Português");
//        Escola escola1 = new Escola("Escola Estadual", "Rua das Flores");
//        Escola escola2 = new Escola("Escola Municipal", "Rua das Pedras");
//        escola1.associarProfessor(professor1);
//        professor2.associarEscola(escola2);
//        escola1.exibirInfo();
//        professor2.exibirInfo();

        // ----------------------------------------- EMPRESA E FUNCIONARIO  ------------------------------------------

        Funcionario func1 = new Funcionario("Rebecca", "Desenvolvedora", 5000.00);
        Funcionario func2 = new Funcionario("Gabriel", "Analista", 7000.00);
        Funcionario func3 = new Funcionario("Tarcila", "Física", 10000.00);
        Empresa empresa1 = new Empresa("Empresa da Barbie", "123456789", 2);
        Empresa empresa2 = new Empresa("Empresa do Ken", "987654321", 1);
        empresa1.contratarFuncionario(func1);
        empresa2.contratarFuncionario(func2);
        empresa2.contratarFuncionario(func3);
        empresa2.contratarFuncionario(func1);
        empresa1.exibirInfo();
        empresa2.exibirInfo();

    }//metodo main
}// classe Main