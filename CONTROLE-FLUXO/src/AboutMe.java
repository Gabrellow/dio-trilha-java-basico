import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {

        try {
        //Criando o objeto Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("Preencha o seguinte formulário:");
        System.out.println("Qual o seu nome? ");
        String nome = s.next();

        System.out.println("Qual o seu sobrenome? ");
        String sobrenome = s.next();

        System.out.println("Qual a sua idade? ");
        int idade = s.nextInt();

        System.out.println("Qual a sua altura? ");
        double altura = s.nextDouble();

        //imprimindo relatório
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm");
        s.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("Preencha os campos idade e altura como numeral!");
        }
    }
}
