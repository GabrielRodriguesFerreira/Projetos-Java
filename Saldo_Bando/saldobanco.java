package Saldo_Bando;
import java.util.Scanner;

public class saldobanco {
    public static void main(String[] args) { 
        double saldoini;
        double saldobanco = 5000.00;
        int senha = 123456;
        Scanner sc = new Scanner (System.in);
        String texto = "BEM VINDO AO BANCO!!";
                for (int i = 1; i <= 3; i++){
                    System.out.println("Por favor, digite sua senha");
                    senha = sc.nextInt();
                        if(senha != 123456){
                            System.out.println("Senha Incorreta, por favor, tente novamente");
                        } else if (senha == 123456){
                            System.out.println(texto);
                            System.out.println();
                            System.out.println("Saldo disponivel para saque: " + saldobanco);
                                System.out.println("Digite o valor do saque: ");
                                saldoini = sc.nextDouble();
                                    if(saldoini > saldobanco){
                                        System.out.println("Saldo Indisponivel! Para sua segurança, digite sua senha novamente");
                                    } else {
                                        System.out.println("Saque feito com sucesso!! Obrigado por usar nosso banco!");
                                        double saldorest = saldobanco - saldoini;
                                        System.out.println("Saldo Disponivel: " + saldorest);
                                        break;
                                    }
                            }
                    }
            }
}
