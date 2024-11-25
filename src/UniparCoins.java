import java.util.ArrayList;
import java.util.List;

public class UniparCoins{

    private double saldo;
    private List<String> historico;

    // Construtor para inicializar o saldo e o histórico
    public UniparCoins() {
        this.saldo = 0.0;
        this.historico = new ArrayList<>();
    }

    // Função para adicionar saldo
    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            historico.add("Adicionado: " + valor);
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor inválido para adicionar ao saldo.");
        }
    }

    // Função para realizar pagamento
    public void realizarPagamento(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            historico.add("Pago: " + valor);
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Função para verificar saldo
    public void verificarSaldo() {
        System.out.println("Seu saldo atual é: " + this.saldo);
    }

    // Função opcional para histórico de transações
    public void historicoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historico) {
            System.out.println(transacao);
        }
    }
}

