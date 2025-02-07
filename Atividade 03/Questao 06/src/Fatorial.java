import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("\nDigite o número que deseja calcular o fatorial: ");
        int num = leitura.nextInt();
        int fatorial = 1;

        System.out.print(String.format("%d! = ", num));

        for (int i = num; i >= 1; i--){
            System.out.print(i);

            if (i > 1){
                System.out.print(" x ");
            }

            fatorial *= i;
        }

        System.out.print(String.format("\n%d! = %d", num, fatorial));
    }
}
