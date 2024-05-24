import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pede o número da conta
        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        //Pede a agência
        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        //Pede o nome
        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        //Pede o saldo
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        //Fechando o scanner
        scanner.close();

        //Mensagem de saída
        String mensagem = String.format(
            "Olá, %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );
        System.out.println(mensagem);
    }
}