/*1. Classes e Objetos Básicos: Crie uma classe Carro com atributos como marca, modelo, e ano.
Instancie três objetos dessa classe e exiba os detalhes de cada um.
2. Métodos Adicione um método acelerar e frear à classe Carro que altere um atributo velocidade. Crie um método para exibir a velocidade atual.
*/

package carro;

public class Carro {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;


    //Método CONSTRUTOR da classe, utilizado para CRIAR o objeto do "zero"
    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    //Métodos Getters e Setters, utilizados para MUDAR valores dos atributos
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    //Método para EXIBIR informações sobre o carro
    public void exibeInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println(("Velocidade: " + velocidade));
    }

    //Métodos para alterar a velocidade

    public void acelerar(int vel_nova){
        this.velocidade = vel_nova;
        this.exibeInfo();
    }

    public void freiar(int vel_nova){
        this.velocidade = vel_nova;
        this.exibeInfo();
    }

    public void exibeVel(){
        System.out.println("Velocidade: " + this.velocidade);
    }

}
