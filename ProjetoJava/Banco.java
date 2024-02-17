package ProjetoJava;

import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas;

    public Banco() {
        // Inicialize a lista de contas no construtor.
        this.contas = new ArrayList<ContaBancaria>();
    }

    public void criarConta(String nome, double saldoInicial) {
        // Cria uma nova conta e a adiciona à lista de contas.
        ContaBancaria novaConta = new ContaBancaria(nome, saldoInicial);
        contas.add(novaConta);
    }

    public void realizarTransferencia(ContaBancaria origem, ContaBancaria destino, double valor) {
        // Verifica se a conta de origem e a conta de destino existem na lista de contas.
        if (contas.contains(origem) && contas.contains(destino)) {
            // Verifica se a conta de origem possui saldo suficiente para a transferência.
            if (origem.getSaldo() >= valor) {
                // Realiza a transferência entre as contas.
                origem.sacar(valor);
                destino.depositar(valor);
            } else {
                System.out.println("Saldo insuficiente na conta de origem.");
            }
        } else {
            System.out.println("Uma das contas não existe no banco.");
        }
    }

    public double calcularSaldoTotal() {
        double saldoTotal = 0;
        for (ContaBancaria conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.criarConta("João", 1000.0);
        banco.criarConta("Maria", 1500.0);

        ContaBancaria contaJoao = banco.contas.get(0);
        ContaBancaria contaMaria = banco.contas.get(1);

        banco.realizarTransferencia(contaJoao, contaMaria, 500.0);

        System.out.println("Saldo total do banco: " + banco.calcularSaldoTotal());
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(String nomeTitular, double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
}
