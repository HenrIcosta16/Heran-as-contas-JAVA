public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    // Construtor da classe ContaCorrente
    public ContaCorrente(int num, double limiteChequeEspecial) {
        super(num);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // metodo atualiza conta
    @Override
    public void atualizaConta() {
        System.out.println("Conta Corrente Atualizada! --> " + this);
        if (getSaldo() < 0) {
            System.out.println("Aviso: Conta Corrente em cheque especial!");
        } else {
            System.err.println("Aviso: Conta Corrente NÃO está em cheque especial! ");
        }
    }
}
  
