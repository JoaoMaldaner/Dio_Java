public class ContaTerminal {
        public static void main(String[] args) {
        // Primeiro cenário
        double saldo1 = 25.0;
        double valorSolicitado1 = 18.0;
        
        // Verifica se o saldo é suficiente para o saque
        if (saldo1 > valorSolicitado1) {
            saldo1 = saldo1 - valorSolicitado1; // Atualiza o saldo após o saque
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo1);
        } else {
            System.out.println("Saldo insuficiente");
        }
        
        // Segundo cenário
        double saldo2 = 15.0;
        double valorSolicitado2 = 22.0;
        
        // Verifica se o saldo é suficiente para o saque
        if (saldo2 > valorSolicitado2) {
            saldo2 = saldo2 - valorSolicitado2; // Atualiza o saldo após o saque
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo2);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
