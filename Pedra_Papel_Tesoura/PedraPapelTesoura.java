import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro jogador:");
        String jogador1 = scanner.nextLine();

        System.out.println("Digite o nome do segundo jogador:");
        String jogador2 = scanner.nextLine();

        System.out.println(jogador1 + ", escolha sua jogada:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        int jogada1 = scanner.nextInt();
        
        System.out.println(jogador2 + ", escolha sua jogada:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        int jogada2 = scanner.nextInt();

        System.out.println(jogador1 + " jogou " + converterJogada(jogada1));
        System.out.println(jogador2 + " jogou " + converterJogada(jogada2));

        
        if (jogada1 == jogada2) {
            System.out.println("Empate!");
        } else if (jogada1 == 1 && jogada2 == 3 || jogada1 == 2 && jogada2 == 1 || jogada1 == 3 && jogada2 == 2) {
            System.out.println(jogador1 + " venceu!");
        } else {
            System.out.println(jogador2 + " venceu!");
        }
    }

    public static String converterJogada(int jogada) {
        if (jogada == 1) {
            return "pedra";
        } else if (jogada == 2) {
            return "papel";
        } else {
            return "tesoura";
        }
    }
}
