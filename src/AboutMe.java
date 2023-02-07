import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        //recebendo paramentros externos pelo terminal cmd
        // String nome = args[0];
        // String sobrenome = args[1];
        // int idade = Integer.valueOf(args[2]);
        // double altura = Double.valueOf(args[3]);

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();

        System.out.println("Digite seu nome: ");
        String nome = leitor.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = leitor.next();

        System.out.println("digite sua idade: ");
        double idade = leitor.nextDouble();


        System.out.println("Olá me chamo " + nome + " " + sobrenome);
        System.out.println("tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
