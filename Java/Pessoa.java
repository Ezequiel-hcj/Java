public class Pessoa {
    private String nome;
    private int idade;
    private int altura; // Adicionado atributo "altura" em centímetros
    private String profissao; // Adicionado atributo "profissao"

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para definir altura
    public void setAltura(int altura) {
        this.altura = altura;
    }

    // Método para definir profissao
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");

        if (altura > 0) {
            System.out.println("Altura: " + altura + " cm");
        }

        if (profissao != null && !profissao.isEmpty()) {
            System.out.println("Profissão: " + profissao);
        }
    }

    // Método para cumprimento personalizado
    public void cumprimentar() {
        if (idade < 18) {
            System.out.println("Olá, " + nome + "! Você ainda é jovem!");
        } else {
            System.out.println("Olá, " + nome + "! Bem-vindo à vida adulta!");
        }
    }
}
