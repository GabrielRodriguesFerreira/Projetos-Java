import java.util.Scanner;

public class TrabalhoEstacionamento {
    public static void main(String[] args) {
        int[] vagas = new int[5]; 
        int vagasOcupadas = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número da vaga (1 a 5): ");
            int numeroVaga = scanner.nextInt();
            if (numeroVaga >= 1 && numeroVaga <= 5) {
                if (vagas[numeroVaga - 1] == 0) { 
                    vagas[numeroVaga - 1] = 1; 
                    vagasOcupadas++;
                    System.out.println("Estacionado com Sucesso");
                } else {
                    System.out.println("Vaga Ocupada, por favor escolha outra vaga");
                }
            } else {
                System.out.println("Vaga Inválida");
            }
        }
        System.out.println("Vagas disponíveis: " + (5 - vagasOcupadas));
    }
}
