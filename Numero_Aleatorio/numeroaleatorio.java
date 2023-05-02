import java.util.Random;
import java.util.Scanner;

public class numeroaleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String texto = "JOGO DA ADVINHA!";
        int qtdjogadas = 2;
            System.out.println(texto);
            System.out.println();

                for (int i = 0; i <= qtdjogadas; i++){
                    System.out.println("Digite um numero de (1 a 4)");
                    int numero1 = sc.nextInt();
                        int numero = random.nextInt(5);
                        System.out.println("Numero escolhido foi: " + numero);
                            if (numero1 != numero){
                                System.out.println("Que pena, você perdeu!");
                                qtdjogadas--;
                                    if(qtdjogadas == 1){
                                        System.out.println("Não desista, " + qtdjogadas + " tentativa!");
                                    } else if (qtdjogadas == 0) {
                                        System.out.println("Suas tentativas acabaram!!");
                                    }     
                            } else {
                                System.out.println("Parabééns, você ganhou!!");
                                break;
                            }
            }
        
    }
}
