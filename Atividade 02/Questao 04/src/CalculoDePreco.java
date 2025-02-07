public class CalculoDePreco {
    public static void main(String[] args) {
        double precoPrduto = 3.50;
        int quantidade = 5;
        System.out.println(String.format("O resultado da compra de %d maçãs por R$%.2f cada é: %.2f.\n", quantidade, precoPrduto, precoPrduto*quantidade));
    }
}
