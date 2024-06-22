import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Essa criacao de instancia serve para ter  mais de uma contaBancaria
        ContaBancaria conta = new ContaBancaria("Brenda de Paula", "Corrente", 1599.99);

        // Exibir informações iniciais da conta usando getters
        System.out.println("***********************");
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Tipo conta: " + conta.getTipoConta());
        System.out.println("Saldo inicial: " + conta.getSaldo());
        System.out.println("***********************");

        //Para ler o que o usuario digitar
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        String menu = """
                      ** Digite sua opção **
                      1- Consultar saldos
                      2- Transferir valor
                      3- Receber valor
                      4- Sair
                      Digite a opção desejada:
                      """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch(opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Qual o valor da transferência?");
                    double valorTransferencia = leitura.nextDouble();
                    conta.transferirValor(valorTransferencia);
                    break;
                case 3:
                    System.out.println("Valor recebido: ");
                    double valorRecebido = leitura.nextDouble();
                    conta.receberValor(valorRecebido);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
