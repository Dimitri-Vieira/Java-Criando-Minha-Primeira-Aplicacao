import java.util.Scanner;


public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("\nDigite um número para saber se é positivo ou negativo: ");
        int num =  leitura.nextInt();

        if (num >= 0){
            System.out.println("O número " + num + " é positivo.");
        } else {
            System.out.println("O número " + num + " é negativo.");
        }

    }
}
