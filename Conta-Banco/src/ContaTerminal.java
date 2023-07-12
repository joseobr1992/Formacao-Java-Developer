import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 237.48;

        System.out.print("Por favor digite o número da Agencia: ");
        agencia = leitor.next();

        System.out.print("Por favor digite o número da Conta: ");
        numeroConta = leitor.nextInt();

        System.out.print("Por favor digite o seu nome: ");
        nomeCliente = leitor.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + "já está disponivel para saque");

    }
}