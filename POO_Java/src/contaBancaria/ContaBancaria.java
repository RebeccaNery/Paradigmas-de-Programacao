/*3. Encapsulamento Implemente uma classe ContaBancaria com atributos saldo, titular e métodos depositar e sacar.
Use encapsulamento para proteger o atributo saldo. */

/*O encapsulamento em Java é um dos pilares da Programação Orientada a Objetos (POO) e refere-se à prática de restringir
o acesso direto aos atributos de uma classe, permitindo que sejam acessados ou modificados apenas por meio de métodos
específicos (geralmente chamados de getters e setters). Dessa forma, os dados de uma classe ficam protegidos contra
acessos indevidos ou modificações erradas.*/

package contaBancaria;

public class ContaBancaria {

    //Atributos
    private double saldo; //encapsular === private
    private String titular;

    //Método CONSTRUTOR da classe ContaBancaria
    public ContaBancaria(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }

    //Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + String.format("%.2f", saldo));
    }

    public void sacar(double valor){
        this.saldo = saldo - valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + String.format("%.2f", saldo));
    }

    public void exibeInfo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

}//classe
