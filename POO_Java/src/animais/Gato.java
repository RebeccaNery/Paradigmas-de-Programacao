package animais;

public class Gato extends Animal{
    public Gato(String classe, String nome, String cor) {
        super(classe, nome, cor);
    }

    @Override
    public void fazerSom(){
        System.out.println("O gato faz minhauuuuuu");
    }
}
