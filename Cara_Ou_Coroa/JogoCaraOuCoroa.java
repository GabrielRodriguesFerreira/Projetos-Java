import java.util.Scanner;
import java.util.Random;

public class JogoCaraOuCoroa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
      
            System.out.println("Digite o nome do primeiro jogador:");
            String jogador1 = scanner.next();

                System.out.println("Digite o nome do segundo jogador:");
                String jogador2 = scanner.next();
    
                    System.out.println(jogador1 + ", escolha cara ou coroa (c ou o):");
                    String jogada1 = scanner.next();

                        String jogada2 = random.nextInt(2) == 0 ? "c" : "o";
                        System.out.println(jogador2 + " escolheu " + jogada2);

                    
                            if (jogada1.equals(jogada2)) {
                                System.out.println("Empate!");
                            } else if (jogada1.equals("c") && jogada2.equals("o") || jogada1.equals("o") && jogada2.equals("c")) {
                                System.out.println(jogador1 + " venceu!");
                            } else {
                                System.out.println(jogador2 + " venceu!");
                            }
        }
}
