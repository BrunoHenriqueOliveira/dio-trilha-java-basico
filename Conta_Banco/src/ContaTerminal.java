import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        Integer numero = scanner.nextInt();

        System.out.println("Digite o valor do saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$" + saldo  + " já está disponível para saque.");
    }
}
