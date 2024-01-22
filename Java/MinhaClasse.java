public class MinhaClasse {
    public static void main(String[] args) {
        int numero = 10;
        int fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    public static int calcularFatorial(int numero) {
        if (numero < 0) {
            return -1;
        }
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}