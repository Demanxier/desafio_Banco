public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Demanxier");
        Cliente cliente2 = new Cliente("Thainá Sodré");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        Banco banco =new Banco("PobresBank");
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(15000);
        contaPoupanca.depositar(3200);

        System.out.println(banco.getNome());
        banco.listarContas();

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
