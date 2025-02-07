public class Casting {
    public static void main(String[] args) {
        double var1 = 5.2;
        int var2 = 7;
        int casting = (int) (var1);
        System.out.println(String.format("O resultado do casting da variável double nomeada de var1 com o valor %.1f convertido para int é %d.\n", var1, casting));
    }
}
