import java.util.Locale;
import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da agencia! ");
        int numero = entradaTeclado.nextInt();
        entradaTeclado.nextLine();
        System.out.print("Por favor, digite o nome da agencia! ");
        String agencia = entradaTeclado.nextLine();
        System.out.print("Por favor, digite o seu nome! ");
        String nomeCliente = entradaTeclado.nextLine();
        System.out.print("Por favor, digite o saldo da conta! ");
        double saldo = entradaTeclado.nextDouble();
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);

        entradaTeclado.close();
    }
}