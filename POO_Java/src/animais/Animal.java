/*
4. Herança ===> Crie uma classe base Animal com métodos como som. Derive classes como Cachorro e Gato que
implementam o método som de maneiras diferentes.
5. Polimorfismo ===> Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método
som de cada um, demonstrando comportamento diferente para cada subclasse.
*/

package animais;

public class Animal {

    //Atributos
    private String classe;
    private String nome;
    private String cor;

    //Método CONSTRUTOR da classe

    public Animal(String classe, String nome, String cor){
        this.classe = classe;
        this.nome = nome;
        this.cor = cor;
    }

    //Método para EXIBIR as informações
    public void exibeInfo(){
        System.out.println("Classe: " + classe);
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("\n");
    }

    public void fazerSom(){
        System.out.println("Animais fazem barulho!!!\n");
    }

    // getters e setters
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


}
