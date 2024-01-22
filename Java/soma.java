public class soma {
    public static void main(String[] args) {
        // Declara e inicializa a variável soma
        int soma = 0;

        // Usa uma estrutura de repetição for para somar os números de 1 a 10
        for (int i = 5; i <= 10; i++) {
            // Adiciona o valor atual de i à soma
            soma += i;
        }

        // Imprime o resultado
        System.out.println("A soma dos números de 1 a 10 é: " + soma);
    }
}
