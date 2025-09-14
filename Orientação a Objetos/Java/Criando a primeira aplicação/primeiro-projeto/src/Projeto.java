import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        String nome = "Samuel Duarte";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double valorRecebido;
        double valorTransferido;
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("********************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("********************************************");
        System.out.println();
        while (opcao != 4) {
            System.out.println("Operações");
            System.out.println();
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            }
            if (opcao == 2) {
                valorRecebido = scanner.nextDouble();
                if (valorRecebido > 0) {
                    saldo += valorRecebido;
                    System.out.println("Foi adicionado " + valorRecebido + " no seu saldo");
                } else {
                    System.out.println("Não é permitido receber valores negativos");
                }
            }
            if (opcao == 3) {
                valorTransferido = scanner.nextDouble();
                if (valorTransferido <= saldo) {
                    saldo -= valorTransferido;
                    System.out.println("Foi transferido " + valorTransferido + " do seu saldo");
                } else {
                    System.out.println("Não é permitido transferir o valor maior que o seu saldo");
                }
            }
        }
    }
}
