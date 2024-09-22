import carro.Carro;
import contaBancaria.ContaBancaria;
public class Main {
    public static void main(String[] args) {

        // ----------------------------------------- CARRO ------------------------------------------

//        Carro carro1 = new Carro("Audi", "A4", 2006); //Instanciando objeto da classe Carro
//        carro1.exibeInfo(); // Exibindo suas informações
//        carro1.acelerar(100);
//        carro1.freiar(80);
//        carro1.exibeVel();

        // ----------------------------------------- CONTA BANCARIA ------------------------------------------

        ContaBancaria conta1 = new ContaBancaria(1800.93, "Rebecca Nery");
        conta1.exibeInfo();
        conta1.depositar(200.87);
        conta1.sacar(300);

    }//metodo main
}// classe Main