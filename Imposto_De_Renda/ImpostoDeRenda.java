import java.util.Scanner;
import java.text.DecimalFormat;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        double valorPagar, valorTotal, juros1 = 0.075, juros2 = 0.15, juros3 = 0.225, juros4 = 0.275  ;
        Scanner sc = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.##");
        String texto = "CALCULE SEU IMPOSTO DE RENDA";

            System.out.println (texto);
            System.out.println();

                System.out.println("Por favor, insira o salário bruto familiar (mensal): ");
                double salario = sc.nextDouble();

                System.out.println("Por favor, agora insira o número de individuos em sua residência:");
                int individuos = sc.nextInt();
                valorTotal = salario / individuos;

                    if(valorTotal <= 1903.78){
                        System.out.println("Você está isento de impostos!");
                            String resultado = formato.format(valorTotal);
                                System.out.println("Salario: " + resultado);
                    } else if (valorTotal > 1903.78 && valorTotal <= 2826.65){
                        System.out.println("Pagar 7,5% de impostos!");
                                valorPagar = valorTotal * juros1;
                                String resultado = formato.format(valorPagar);
                                    System.out.println("Salario: " + resultado);
                                        System.out.println ("Você vai pagar: " + resultado + " reais de imposto!!");
                                            System.out.println("Salario Final é de: " + (valorTotal - valorPagar));
                    } else if (valorTotal > 2826.65 && valorTotal < 3751.05 ){
                        System.out.println("Pagar 15% de impostos!");  
                                valorPagar = valorTotal * juros2;
                                String resultado = formato.format(valorPagar);
                                    System.out.println("Salario: " + resultado);
                                        System.out.println ("Você vai pagar: " + resultado + " reais de imposto!!");
                                            System.out.println("Salario Final é de: " + (valorTotal - valorPagar));
                    } else if (valorTotal > 3751.05 && valorTotal < 4664.68) {
                        System.out.println("Pagar 22,5% de impostos!");  
                                valorPagar = valorTotal * juros3;
                                String resultado = formato.format(valorPagar);
                                    System.out.println("Salario: " + resultado);
                                        System.out.println ("Você vai pagar: " + resultado + " reais de imposto!!");
                                            System.out.println("Salario Final é de: " + (valorTotal - valorPagar));
                    } else {
                        System.out.println("Pagar 27,5% de impostos!");  
                                valorPagar = valorTotal * juros4;
                                String resultado = formato.format(valorPagar);
                                    System.out.println("Salario: " + resultado);
                                        System.out.println ("Você vai pagar: " + resultado + " reais de imposto!!");
                                            System.out.println("Salario Final é de: " + (valorTotal - valorPagar));
        }
    }
}
