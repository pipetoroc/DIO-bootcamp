import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor indique o numero da agencia: ");
        agencia = sc.nextLine();

        System.out.println("Por favor indique seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor indique o numero da sua conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Por favor digite o saldo da sua conta: ");
        saldo = sc.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagem);


        sc.close();
    }
}
