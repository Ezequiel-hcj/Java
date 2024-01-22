public class index {

    public static void main(String[] args) {
        System.out.println("Início da Execução");
        int numero = 10;
        int dobro = 0;
        double n = 30;

        dobro = dobroDoNumero(numero);
        System.out.println(dobro);

        double triplo = triploDoNumero(n);
        System.out.println(triplo);

    }

    public static int dobroDoNumero(int numero) {
        int dobro = numero * 2;
        return dobro;
    }

    public static double triploDoNumero(double numero) {
        double triplo = numero * 3;
        return triplo;

    }

    public static void printEzequiel(int n, double d) {
        System.out.println("Ezequiel disse: " + n + " e disse que o dobro é " + d);
    }

    public static void printJoana(int n) {
        System.out.println("Joana disse: " + n);
    }
}