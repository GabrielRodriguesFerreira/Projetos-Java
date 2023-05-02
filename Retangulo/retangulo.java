package Retangulo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class retangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.println("CALCULE AQUI SEU RETANGULO!");
            System.out.println("Digite a largura do retangulo. ");
            double largura = sc.nextDouble();
            System.out.println("Digite a altura do seu retangulo. ");
            double altura = sc.nextDouble();
            double A = largura * altura;
            DecimalFormat formato = new DecimalFormat("#.##");
            String resultado = formato.format(A);
            System.out.println("A área do retangulo é de: " + resultado + " m²."); 
        
    }
}
