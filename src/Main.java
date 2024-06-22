import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("Seus dados:");
        System.out.println("Nome: " + conta.nome);
        System.out.println("Tipo conta: " + conta.tipoConta);
        System.out.println("Saldo inicial: " + conta.saldo);
        System.out.println("***********************");

        String menu = """
                        ** Digite sua opcao**
                        1- Consultar saldos;
                        2- Transferir valor;
                        3- Receber valor
                        4- Sair;
                        Digite a opção desejada:
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + conta.saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor da transferencia?");
                double valor = leitura.nextDouble();
                if (valor > conta.saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    conta.saldo -= valor;
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                conta.saldo += valor;
            } else if (opcao != 4) {
                System.out.println("Opcao invalida");
            }
        }
    }
}