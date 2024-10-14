package singleton;

public class Configuracao {

    // Variável estática que armazena a única instância da classe
    private static Configuracao instanciaUnica;

    // Atributos da classe (exemplo de configuração)
    private String config1;
    private String config2;

    // Construtor privado para impedir a criação de novas instâncias
    private Configuracao() {
        // Defina valores padrão para as configurações
        config1 = "Valor Padrão 1";
        config2 = "Valor Padrão 2";
    }

    // Método estático para obter a única instância da classe
    public static Configuracao getInstancia() {
        if (instanciaUnica == null) {
            // Criar a instância se ainda não foi criada
            instanciaUnica = new Configuracao();
        }
        return instanciaUnica;
    }

    // Métodos para acessar e modificar as configurações
    public String getConfig1() {
        return config1;
    }

    public void setConfig1(String config1) {
        this.config1 = config1;
    }

    public String getConfig2() {
        return config2;
    }

    public void setConfig2(String config2) {
        this.config2 = config2;
    }
}
