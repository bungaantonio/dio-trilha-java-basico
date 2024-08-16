import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // TODO: Verifique se o serviço está na lista de serviços contratados

        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equals(servico)) {
                contratado = true;
                break;
            }
        }
        if (contratado) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");

        }
        scanner.close();
    }

}
