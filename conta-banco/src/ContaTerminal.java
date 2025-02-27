import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine().trim();
        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine().trim().toUpperCase();
        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.close();

       System.out.println("Olá " + nomeCliente + 
       ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
       ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
