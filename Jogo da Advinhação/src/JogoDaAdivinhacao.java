import java.util.Scanner;
import java.util.Random;


public class JogoDaAdivinhacao {
    public static void main(String[] args){

        Scanner leitura = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(100);
        int numeroTentativas = 1;

        System.out.println(String.format(
                """
                        ****************** Jogo da Adivinhação ******************
                        
                        Regra: Você terá 5 tentativas para acertar o número secreto.
                        
                        Digite "ok" para iniciar o jogo: """));

        String iniciarJogo = leitura.nextLine();

        // se a palavra digitada for igual a "ok" o jogo começa
        if (iniciarJogo.equals("ok")){

            System.out.println("\nVamos começar!");

            // enquanto o número de tentativas for menor ou igual a 5
            while (numeroTentativas <= 5){
                System.out.println("Chute um número de 0 a 100: ");
                int chute = leitura.nextInt();

                // se o chute for correto, ou seja, igual ao número secerto, o jogo se encerra
                if (chute == numeroSecreto){
                    System.out.println(String.format("\nParabéns! Você acertou o número secreto! O número secreto era '%d'.", numeroSecreto));
                    System.out.println(String.format("Você acertou na %d° tentativa.", numeroTentativas));
                }
                // se chute for menor que o número secreto
                if (chute < numeroSecreto){
                    System.out.println(String.format("\nO número secreto é maior que %d.", chute));
                    numeroTentativas++;
                }
                // se chute for maior que número secreto
                if (chute > numeroSecreto){
                    System.out.println(String.format("\nO número secreto é menor que %d.", chute));
                    numeroTentativas++;
                }
                // se chute for diferente do número secreto e o número de tentativas se esgotar
                if (chute != numeroSecreto && numeroTentativas > 5){
                    System.out.println(String.format(
                            """
                                    \n\nInfelizmente você não achou o número secreto. Mas não se desanime! Você ainda pode tentar jogar uma nova partida!
                                    O número secreto era '%d'.
                                    """, numeroSecreto));
                    break;
                }

            }

        // se a palavra digitada não for "ok" o jogo não se inicia e o programa se encerra
        } else {
            System.out.println("Obrigado por visitar o Jogo da Advinhação! Volte sempre que quiser.");
        }

    }
}
