import carro.Carro;
public class Main {
    public static void main(String[] args) {

        //Instanciando objeto da classe Carro
        Carro carro1 = new Carro("Audi", "A4", 2006);
        // Exibindo suas informações
        carro1.exibeInfo();
        carro1.acelerar(100);
        carro1.freiar(80);


    }//metodo main
}// classe Main