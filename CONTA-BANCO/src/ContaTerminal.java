import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");
        int numeroConta = s.nextInt();
        s.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agenciaConta = s.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = s.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldoConta = s.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agenciaConta+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque");
        
        s.close();
    }
}
