public class ContaPoupanca extends Conta {
    private double juros;

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(int num, double juros) {
        super(num);
        this.juros = juros;
    }

    // Adiciona rendimentos ao saldo da conta poupança
    public void adicionaRendimentos() {
        double rendimento = getSaldo() * (juros / 100);
        deposito(rendimento);
    }

    // metodo atualiza conta
    @Override
    public void atualizaConta() {
        adicionaRendimentos();
        System.out.println("Conta Poupança Atualizada! --> " + this);
        if (getSaldo() < 0) {
            System.out.println("Aviso: Conta Poupança em cheque especial!");
        }
    }
}
