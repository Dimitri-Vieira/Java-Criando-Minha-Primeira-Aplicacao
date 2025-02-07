import java.util.Scanner;

public class CalculoDeArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                
                ********** Calculadora de Área **********
                
                1. Calcular área do quadrado.
                2. Calcular área do círculo.
                
                Insira o número que corresponde ao polígono que deseja calcular a área: """);

        int numCalculo = leitura.nextInt();

        switch (numCalculo){
            case 1:
                System.out.println("\n************* Área do Quadrado *************");
                System.out.println("Insira o valor do primero lado em metros: ");
                double lado1 = leitura.nextDouble();
                System.out.println("Insira o valor do segundo lado em metros: ");
                double lado2 = leitura.nextDouble();

                double areaQuadrado = lado1*lado2;

                System.out.println(String.format("\nO valor da área desse quadrado é: %.2f m²", areaQuadrado));
                break;

            case 2:
                System.out.println("\n************* Área do Círculo *************");
                System.out.println("Insira o valor do raio em metros: ");
                double raio = leitura.nextDouble();

                double areaCirculo = Math.PI * Math.pow(raio, 2);

                System.out.println(String.format("\nO valor da área desse círculo é: %.2f m²", areaCirculo));
                break;

            default:
                System.out.println("ERRO! Verifique as opções de operações disponíveis e digite o número que as correspondem corretamente.");
                break;
        }
    }
}
