import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        // Criando o scanner para leitura da entrada
        Scanner scanner = new Scanner(System.in);

        // Criando o DecimalFormat para garantir 2 casas decimais
        DecimalFormat df = new DecimalFormat("#.00");

        // Lendo o saldo inicial
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Formatando o saldo para garantir 2 casas decimais
        saldo = Double.parseDouble(df.format(saldo));

        // Lendo as três transações
        System.out.print("Digite o valor da 1ª transação: ");
        double transacao1 = scanner.nextDouble();
        transacao1 = Double.parseDouble(df.format(transacao1));

        System.out.print("Digite o valor da 2ª transação: ");
        double transacao2 = scanner.nextDouble();
        transacao2 = Double.parseDouble(df.format(transacao2));

        System.out.print("Digite o valor da 3ª transação: ");
        double transacao3 = scanner.nextDouble();
        transacao3 = Double.parseDouble(df.format(transacao3));

        // Calculando o saldo final
        double saldoFinal = saldo + transacao1 + transacao2 + transacao3;

        // Exibindo o saldo final com 2 casas decimais
        System.out.printf("O saldo final da conta é: %.2f\n", saldoFinal);

        // Fechando o scanner
        scanner.close();
    }
}
