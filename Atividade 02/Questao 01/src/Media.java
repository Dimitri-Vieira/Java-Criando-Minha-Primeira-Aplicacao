public class Media {
    public static void main(String[] args) {
        double nota1 = 7.8;
        double nota2 = 8.3;
        double media = (nota1 + nota2) / 2; // calculo da média entre as duas notas
        System.out.println(String.format("O resultado da media entre %.1f e %.1f é %.1f.", nota1, nota2, media));
    }
}
