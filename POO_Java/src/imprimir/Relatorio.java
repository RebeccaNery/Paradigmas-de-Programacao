package imprimir;

public class Relatorio implements Imprimivel {
    private String titulo;
    private String descricao;

    public Relatorio(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    @Override
    public void imprimir() {
        System.out.println(">>> Relatório <<<");
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("------------------------------------------------");
    }

}
