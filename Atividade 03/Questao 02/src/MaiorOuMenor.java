import java.util.Scanner;

public class MaiorOuMenor {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("\nInsira dois números inteiros para a comparação.");
        System.out.println("Primeiro número: ");
        int num1 = leitura.nextInt();
        System.out.println("\nSegundo número: ");
        int num2 = leitura.nextInt();

        if (num1 == num2) {
            System.out.println("\nOs números " + num1 + " e " + num2 + " são iguais.");
            return;
        } else {
            System.out.println("\nOs números " + num1 + " e " + num2 + " são diferentes.");
        }

        if (num1 > num2) {
            System.out.println("O número " + num1 + " é maior que o número " + num2 + ".");
        } else {
            System.out.println("O número " + num2 + " é maior que o número " + num1 + ".");
        }

    }
}
