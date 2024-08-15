import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    static double salarioBase = 2000.0;

    public static void main(String[] args) throws Exception {
        imprimirCandidatos();
    }

    static void imprimirCandidatos() {
        String[] candidatos = { "BUNGA", "ANTONIO", "JOAO", "EUGENIA" };

        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }

    }

    static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println(candidato + ", atendeu na " + tentativasRealizadas + " tentativa.");
        } else {
            System.out.println(candidato + ", não atendeu. (" + tentativasRealizadas + " tentativas feitas)");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void selecionarCandidatos() {
        String[] candidatos = { "BUNGA", "ANTONIO", "JOAO", "EUGENIA", "PEDRO", "MAURA", "MONIZ", "VEMBA" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + ", solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM A MESMA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DE MAIS CANDIDATOS");

        }
    }
}
