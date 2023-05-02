import java.util.Scanner;

public class NotasNecessarias{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String texto = "BEM VINDO AO CAIXA";
            System.out.println (texto);
            System.out.println();

                System.out.println("Digite a quantia de dinheiro: ");
                int quantia = sc.nextInt();

                    int [] notas = {200, 100, 50, 20, 10, 5, 2};
                    int [] quantidades = new int[notas.length];

                        for (int i = 0; i < notas.length; i++){
                                while (quantia >= notas[i]){
                                        quantia -= notas[i];
                                        quantidades[i]++;
                                }
                            }
                System.out.println("Quantidade necessaria será de:");
                    for (int i = 0; i < notas.length; i++) {
                        if (quantidades[i] > 0) {
                            System.out.printf("%d nota(s) de R$%d\n", quantidades[i], notas[i]);
                }
        }
    }
}    


