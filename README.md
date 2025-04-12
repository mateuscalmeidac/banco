# Projeto Banco - Conta Bancária

Este repositório contém a implementação da classe `ContaBancaria` em Java, que simula uma conta bancária simples com funcionalidades de depósito e saque.

## Descrição

O projeto demonstra a criação de uma classe `ContaBancaria` que permite realizar operações de depósito e saque, além de exibir o saldo atual da conta. As operações de depósito e saque exibem mensagens de sucesso ou falha, dependendo da operação.

## Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

* `ContaBancaria.java`: Implementa a classe `ContaBancaria` com atributos e métodos para gerenciar o saldo e realizar operações financeiras.
* `Main.java`: Classe principal que demonstra o uso da classe `ContaBancaria`.

## Como Executar

1.  Clone o repositório:

    ```bash
    git clone [https://github.com/mateuscalmeidac/banco.git](https://github.com/mateuscalmeidac/banco.git)
    ```

2.  Compile os arquivos Java:

    ```bash
    javac Banco/*.java
    ```

3.  Execute a classe `Main`:

    ```bash
    java Banco.Main
    ```

## Exemplo de Uso

A classe `Main` demonstra como criar uma instância de `ContaBancaria` e realizar operações de depósito e saque.

```java
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.exibirSaldo();
        conta.depositar(700.0);
        conta.exibirSaldo();
        conta.sacar(300.0);
        conta.exibirSaldo();
        conta.sacar(1500.0);
    }
}
