import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("\nInsira o número que deseja visualizar a tabuada de multiplicação de 0 a 10: ");
        int fator = leitura.nextInt();

        System.out.println(String.format("\n\n********** TABUADA DE %d **********\n", fator));
        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", i, fator, i*fator));
        }
    }
}
