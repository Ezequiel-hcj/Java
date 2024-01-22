package conta;
import java.sql.Date;
import java.util.ArrayList;

public class Conta {
    private double saldo;
    private String titular;
    private String NConta;
    private Date dataCriacao;
    private String senha;
    private ArrayList<String> his;

    public Conta(double saldoInicial, String dono, String NConta, String senha) {
        this.saldo = saldoInicial;
        this.titular = dono;
        this.NConta = NConta;
        this.senha = senha;

        this.his = new ArrayList<String>();
        this.dataCriacao = new Date(System.currentTimeMillis());
    }

    public void getConta() {
        System.out.println("Informações da conta:");
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Número da Conta: " + this.getNConta());
        System.out.println("Data de Criação: " + this.getDataCriacao());
        System.out.println("Senha: " + this.getSenha());
        System.out.println("\n");
    }

    public String getSenha() {
        return this.senha;
    }

    public String getTitular() {
        return this.titular;
    }

    public Date getDataCriacao() {
        return this.dataCriacao;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNConta() {
        return this.NConta;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            this.his.add("Fez saque de R$" + valor);

            return true;
        } else {
            this.his.add("Não conseguiu sacar R$" + valor);

            return false;
        }
    }

    public double depositar(double valor) {
        this.his.add("Fez depósito de R$" + valor);
        this.saldo += valor;

        return this.getSaldo();
    }

    public void extrato() {
        System.out.println("-----");

        if (this.his.size() == 0) {
            System.out.println("Nenhum extrato realizado.");
        } else {
            for (int i = 0; i < this.his.size(); i++) {
                System.out.println(this.his.get(i));
                System.out.println("-----");
            }

            this.his.add("Pediu extrato");
        }
    }

    public boolean transferir(double valor, Conta usuario) {
        if (valor > this.saldo) {
            System.out.println("Você não possui esse saldo para ser transferido");

            return false;
        } else {
            this.saldo -= valor;
            usuario.depositar(valor);

            System.out.println("Transferência realizada com sucesso. Valor transferido: " + valor);

            return true;
        }
    }
}
