import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void listarContas(){
        for(Conta conta : contas){
            System.out.println(String.format("Titular: %s, Agencia: %d, Numero: %d, Saldo: %.2f",
                    conta.getCliente().getNome(), conta.getAgencia(), conta.getNumero(), conta.getSaldo()));
        }
    }
}
