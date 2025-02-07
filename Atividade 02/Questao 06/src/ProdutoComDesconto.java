public class ProdutoComDesconto {
    public static void main(String[] args) {
        double precoOriginal = 24;
        double percentualDesconto = 10;
        char simbolPorcento = '%'; // declarei esse char para que pudesse inserir um "%" no final de "Percentual de desconto"
        System.out.println(String.format("""
                Preço original do produto: R$%.2f.
                Percentual de desconto: %.0f%c.
                Valor do produto após aplicação de desconto: R$%.2f.
                """, precoOriginal, percentualDesconto, simbolPorcento, precoOriginal - (percentualDesconto/100)*precoOriginal));

    }
}
