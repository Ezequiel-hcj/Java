public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double calcularValorTotalEmEstoque() {
        return preco * quantidadeEmEstoque;
    }

    public void adicionarProdutos(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades do produto " + nome + " adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public void removerProdutos(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades do produto " + nome + " removidas do estoque.");
        } else {
            System.out.println("Quantidade inválida para remover do estoque ou estoque insuficiente.");
        }
    }

    public static void main(String[] args) {
        String nomeDoProduto = "Celular";
        double precoDoProduto = 1200.0;
        int quantidadeInicialEmEstoque = 10;

        Produto meuProduto = new Produto(nomeDoProduto, precoDoProduto, quantidadeInicialEmEstoque);

        System.out.println("Valor total em estoque: R$" + meuProduto.calcularValorTotalEmEstoque());

        meuProduto.adicionarProdutos(5);
        System.out.println("Valor total em estoque: R$" + meuProduto.calcularValorTotalEmEstoque());

        meuProduto.removerProdutos(3);
        System.out.println("Valor total em estoque: R$" + meuProduto.calcularValorTotalEmEstoque());
    }
}
