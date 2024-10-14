import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import carro.Carro;
import carro.CarroComMotor;
import carro.Motor;
import contaBancaria.ContaBancaria;
//import empresa.Funcionario;
//import empresa.Empresa;
import escola.Escola;
import escola.Professor;
import excecoes.SaldoInsuficienteException;
import imprimir.Imprimivel;
import imprimir.Relatorio;
import imprimir.Contrato;
import calculadora.Calculadora;
import funcAbstrato.FuncionarioAbstrato;
import funcAbstrato.FuncAssalariado;
import funcAbstrato.FuncHorista;
import matematica.Matematica;
import singleton.Configuracao;
import somarProdutos.Produto;


public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException {

        // TESTES DAS CLASSES

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
//        conta1.sacar(5000);

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

//        Funcionario func1 = new Funcionario("Rebecca", "Desenvolvedora", 5000.00);
//        Funcionario func2 = new Funcionario("Gabriel", "Analista", 7000.00);
//        Funcionario func3 = new Funcionario("Tarcila", "Física", 10000.00);
//        Empresa empresa1 = new Empresa("empresa da Barbie", "123456789", 2);
//        Empresa empresa2 = new Empresa("empresa do Ken", "987654321", 1);
//        empresa1.contratarFuncionario(func1);
//        empresa2.contratarFuncionario(func2);
//        empresa2.contratarFuncionario(func3);
//        empresa2.contratarFuncionario(func1);
//        empresa1.exibirInfo();
//        empresa2.exibirInfo();

        // ----------------------------------------- INTERFACE IMPRIMIVEL  ------------------------------------------

//        Contrato contrato1 = new Contrato("Contrato de compra e venda", "Compra de um carro");
//        contrato1.imprimir();
//        Relatorio relatorio1 = new Relatorio("Relatório de vendas", "Vendas do mês de setembro");
//        relatorio1.imprimir();

        // ----------------------------------------- CALCULADORA  ------------------------------------------

//        Calculadora calc = new Calculadora();
//        calc.somar(2, 3);
//        calc.somar(2, 3, 4);

        // ----------------------------------------- FUNCIONARIO ABSTRATO  ------------------------------------------

//        FuncionarioAbstrato func1 = new FuncAssalariado("Rebecca", 5000.00);
//        FuncionarioAbstrato func2 = new FuncHorista("Gabriel", 50.00, 100.00);
//        func1.calcularSalario();
//        func2.calcularSalario();

        // ----------------------------------------- SOMAR PRODUTOS  ------------------------------------------
        // Criando dois objetos Produto
//        Produto produto1 = new Produto("Produto A", 30.0);
//        Produto produto2 = new Produto("Produto B", 50.0);
//
//        // Somando os produtos usando o método somar
//        Produto produtoSomado = produto1.somar(produto2);
//
//        // Exibindo os produtos individuais e o resultado da soma
//        System.out.println(produto1);
//        System.out.println(produto2);
//        System.out.println("Resultado da soma:");
//        System.out.println(produtoSomado);

        // ----------------------------------------- MATEMATICA  ------------------------------------------
        // Testando o método estático calcularFatorial
//        int numero = 5;
//        int fatorial = Matematica.calcularFatorial(numero);
//        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        // ----------------------------------------- CONFIGURACAO  ------------------------------------------
        // Tentando obter a instância da classe Configuracao
//        Configuracao configuracao1 = Configuracao.getInstancia();
//        System.out.println("Configuração 1, Valor de config1: " + configuracao1.getConfig1());
//
//        // Modificando a configuração
//        configuracao1.setConfig1("Novo Valor 1");
//
//        // Obtendo a instância novamente
//        Configuracao configuracao2 = Configuracao.getInstancia();
//        System.out.println("Configuração 2, Valor de config1: " + configuracao2.getConfig1());
//
//        // Verificando se ambas as referências apontam para a mesma instância
//        if (configuracao1 == configuracao2) {
//            System.out.println("As duas referências são a mesma instância.");
//        } else {
//            System.out.println("As duas referências são instâncias diferentes.");
//        }




    }//metodo main
}// classe Main