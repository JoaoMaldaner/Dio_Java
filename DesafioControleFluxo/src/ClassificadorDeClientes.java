import java.util.Scanner;

public class ClassificadorDeClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo do cliente: R$ ");
        if (scanner.hasNextDouble()) {
            double saldo = scanner.nextDouble();
            String classificacao = classificarSaldo(saldo);
            System.out.println("Classificação do cliente: " + classificacao);
        } else {
            System.out.println("Por favor, digite um valor numérico válido para o saldo.");
        }

        scanner.close();
    }

    public static String classificarSaldo(double saldo) {
        if (saldo < 0) {
            return "Negativado";
        } else if (saldo <= 500) {
            return "Baixo";
        } else {
            return "Confortável";
        }
    }
}
