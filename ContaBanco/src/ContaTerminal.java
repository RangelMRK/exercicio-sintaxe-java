import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, iremos iniciar o processo de criação de sua conta!");
        System.out.println("Por favor, digite seu nome completo: ");
        var name = input.nextLine();
        System.out.println("Por favor, agora digite o numero da Agência (ex: 067-8): ");
        var agNumber = input.nextLine();
        System.out.println("Por favor, agora digite o numero da conta: ");
        var accountNumber = input.nextInt();
        input.nextLine();
        System.out.println("Por favor, agora digite o saldo da sua conta: ");
        var funds = input.nextDouble();
        input.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo " +
                "%.2f já está disponivel para saque", name, agNumber, accountNumber, funds);
    }
}
