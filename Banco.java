import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    // Construtor da classe Banco
    public Banco() {
        this.contas = new ArrayList<>();
    }

    // Método para abrir uma nova conta no banco
    public void abrirConta(Conta conta) {
        contas.add(conta);
        System.out.println("Nova conta aberta: " + conta);
    }

    // Método para fechar uma conta no banco
    public void fecharConta(Conta conta) {
        contas.remove(conta);
        System.out.println("Conta fechada: " + conta);
    }

    // Método para pagar boletos/títulos
    public void pagarBoleto(Conta conta, double valor) {
        conta.saque(valor);
        System.out.println("Boleto pago. Saldo atual: " + conta.getSaldo());
    }

     // metodo atualiza conta
    public void atualizarContas() {
        for (Conta conta : contas) {
            conta.atualizaConta();
        }
    }
}
