
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
        //analisarCandidato(1900.0);
        //analisarCandidato(2200.0);
        //analisarCandidato(2000.0);
    }

    static void imprimirSelecionados (){
        String [] candidatos = {"FELIPE", "MARCOS", "MARCIA", "JOAO", "PEDRO", "JORGE", "MIRELA", "DANIELA", "CAROL", "MONICA",};
        System.out.println("Imprimindo a lista de candidatos informando o indice de cada elemento");

        for (int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada sem o indice");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato
            );
        }
    }

    static void  selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCOS", "MARCIA", "JOAO", "PEDRO", "JORGE", "MIRELA", "DANIELA", "CAROL", "MONICA",};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou o valor de: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase==salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO RESULTADO DOS OUTROS CANDIDATOS");
        }

    }
}
