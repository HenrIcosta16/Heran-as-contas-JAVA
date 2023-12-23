public class MainTeste {

    public static void main(String[] args) {
        Banco banco = new Banco();

        // Criando algumas contas de teste
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(1, 2.5);
        contaPoupanca1.deposito(1200);
        ContaCorrente contaCorrente1 = new ContaCorrente(2, 1000);
        contaCorrente1.deposito(2000);
        // Adicionando as contas ao banco
        banco.abrirConta(contaPoupanca1);
        banco.abrirConta(contaCorrente1);

       
        // Pagando boletos/títulos
        banco.pagarBoleto(contaPoupanca1, 500);
        banco.pagarBoleto(contaCorrente1, 300);

        // Metodo atualizar contas
        banco.atualizarContas();
    }
}
