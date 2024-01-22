package conta;
public class Main {
    public static void main(String[] args) {
        Conta Nathan = new Conta(20000, "Nathan Lucca", "0001", "123");

        Nathan.getConta();

        Conta Denini = new Conta(10000, "Denini Gabriel", "0002", "12345");

        Denini.getConta();

        Nathan.transferir(10000, Denini);

        System.out.println("------------------------------");

        Nathan.getConta();

        Denini.getConta();
    }
}