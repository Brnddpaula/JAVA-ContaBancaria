import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Brenda de Paula";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("***********************");
        System.out.println("Seus dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
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
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor da transferencia?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
            } else if (opcao != 4) {
                System.out.println("Opcao invalida");
            }
        }
    }
}