package calculadora;

public class Calculadora {
    public static double somar(double a, double b) {
        System.out.println("Somando dois números");
        System.out.println("Número 1: " + a);
        System.out.println("Número 2: " + b);
        System.out.println("Resultado: " + (a + b));
        return a + b;
    }

    public static double somar(double a, double b, double c) {
        System.out.println("Somando três números");
        System.out.println("Número 1: " + a);
        System.out.println("Número 2: " + b);
        System.out.println("Número 3: " + c);
        System.out.println("Resultado: " + (a + b + c));
        return a + b + c;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }
}
