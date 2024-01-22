package contabacária;
public class Main {
    public static void main(String[] args) {
       
        ContaBancaria minhaConta = new ContaBancaria("João");

        
        minhaConta.exibirSaldo();

        
        minhaConta.depositar(1000.0);
        minhaConta.exibirSaldo();

        
        minhaConta.sacar(500.0);
        minhaConta.exibirSaldo();

        
        minhaConta.sacar(600.0);

        
        minhaConta.depositar(-100.0);

        
        minhaConta.exibirSaldo();
    }
}
