package Banco;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    // Método para exibir o saldo atual
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    // Método principal para teste
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", 2000.0);
        conta.exibirSaldo();
        conta.depositar(700.0);
        conta.exibirSaldo();
        conta.sacar(300.0);
        conta.exibirSaldo();
        conta.sacar(1500.0); // Tentativa de saque com saldo insuficiente
    }
}
