package excecoes;

public class SaldoInsuficienteException extends Exception {

    // Construtor que recebe uma mensagem personalizada para a exceção
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

