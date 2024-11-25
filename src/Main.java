 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UniparCoins carteira = new UniparCoins();
        int opcao;

        System.out.println("Bem-vindo à sua Carteira Digital!");

        while (true) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para adicionar ao saldo: ");
                    double  valoradicionar= scanner.nextDouble();
                    UniparCoins adicionarSaldo = new UniparCoins();

                    break;
                case 2:
                    System.out.print("Digite o valor do pagamento: ");
                    double valorPagamento = scanner.nextDouble();
                    carteira.realizarPagamento(valorPagamento);
                    break;
                case 3:
                    UniparCoins valorpagamento= new UniparCoins();
                    break;
                case 4:
                    System.out.println("Obrigado por usar a sua Carteira Digital!");
                    scanner.close();
                    return;
                case 5:
                     UniparCoins saldohistorico = new UniparCoins();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // Função para exibir o menu
    public static void exibirMenu() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Adicionar Saldo");
        System.out.println("2 - Realizar Pagamento");
        System.out.println("3 - Verificar Saldo");
        System.out.println("4 - Sair");
        System.out.println("5 - Histórico de Transações (Opcional)");
    }
}