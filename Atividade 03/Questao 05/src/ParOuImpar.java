import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);

        System.out.println("\n\nInsira o número que deseja saber se é par ou ímpar: ");
        int num = leitura.nextInt();

        if (num % 2 == 1){
            System.out.println(String.format("\nO número %d é ímpar.", num));
        } else {
            System.out.println(String.format("\nO número %d é par.", num));
        }

    }
}
