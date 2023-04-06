import java.util.Scanner;

public class Exercicio_2 {
    
    public static void main(String[] args) throws Exception {

        int numero;

        Scanner input;

        input = new Scanner(System.in);

        System.out.println("Digite um número: ");

        numero = input.nextInt();

        input.close();

        System.out.println("O número digitado foi: " + numero);

    }
    
}
