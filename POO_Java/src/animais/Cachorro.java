package animais;

public class Cachorro extends Animal{
    public Cachorro(String classe,String nome, String cor) {
        super(classe, nome, cor);
        //this.classe = "Mamífero";
    }
    @Override
    public void fazerSom(){
        System.out.println("O cachorro faz auauauauauuuuu");
    }
}
