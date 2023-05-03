import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
  try {


      // criando objeto scanner
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Nome:");
      String nome = sc.nextLine();
      System.out.println("Sobrenome:");
      String sobrenome = sc.nextLine();
      System.out.println("idade:");
      int idade = sc.nextInt();
      System.out.println("Altura:");
      double altura = sc.nextDouble();

      // imprimindo dados
      System.out.println("Olá, me chamo " + nome.toUpperCase() + "" + sobrenome);
      System.out.println("Tenho " + idade + " anos");
      System.out.println("Minha Altura é " + altura + "cm");
      sc.close();


  } catch (InputMismatchException e){
      System.err.println(" Os campos idade e altura prescisam ser numéricos:");


  }
    }
}