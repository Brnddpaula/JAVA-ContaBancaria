public class ContaBancaria {
    private String nome;
    private String tipoConta;
    private double saldoInicial;

    // Construtor para inicializar os atributos
    public ContaBancaria(String nome, String tipoConta, double saldoInicial) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldoInicial = saldoInicial;
    }

    // Getter e Setter para o atributo nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para o atributo tipoConta
    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    // Getter e Setter para o atributo saldo
    public double getSaldo() {
        return saldoInicial;
    }

    public void setSaldo(double saldo) {
        this.saldoInicial = saldo;
    }

    // Método para consultar o saldo
    public void consultarSaldo() {
        System.out.println("O saldo atualizado é: " + this.saldoInicial);
    }

    // Método para transferir valor
    public void transferirValor(double valor) {
        if (valor > this.saldoInicial) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldoInicial -= valor;
            System.out.println("Transferência realizada. Novo saldo: " + this.saldoInicial);
        }
    }

    // Método para receber valor
    public void receberValor(double valor) {
        this.saldoInicial += valor;
        System.out.println("Valor recebido. Novo saldo: " + this.saldoInicial);
    }
}
