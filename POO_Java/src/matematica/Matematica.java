package matematica;

public class Matematica {

    // Método estático para calcular o fatorial de um número
    public static int calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não-negativo.");
        }
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}

