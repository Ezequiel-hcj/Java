public class carro {

    private String marca;
    private String modelo;
    private int ano;

    public carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {

        carro meuCarro = new carro("Toyota", "Corolla", 2024);

        meuCarro.exibirInformacoes();
    }
}
