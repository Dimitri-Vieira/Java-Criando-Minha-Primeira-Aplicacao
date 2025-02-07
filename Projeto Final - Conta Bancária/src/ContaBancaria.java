import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args){
        String nome = "Dimitri Kael";
        String tipoConta = "Corrente";
        double saldo = 2000.55;
        int opcao = 0;

        System.out.println("****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n****************************");

        String menu = """
                
                ** Digite a sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                Opção: """;

        Scanner leitura = new Scanner(System.in);

        while(opcao != 4){
            System.out.print(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("\n<<< O saldo atualizado é: " + saldo + " >>>");
            } else if (opcao == 2){
                System.out.print("\nQual o valor que deseja transferir?\nValor: ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("\n<<< Não há saldo para realizar transferência. >>>");
                } else {
                    saldo -= valor;
                    System.out.println("\n<<< Novo saldo: " + saldo + " >>>");
                }
            } else if (opcao == 3){
                System.out.print("\nValor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("\n<<< Novo saldo: " + saldo + " >>>");
            } else if (opcao != 4){
                System.out.println("\n<<< Opção inválida. >>>");
            }
        }
    }

}
