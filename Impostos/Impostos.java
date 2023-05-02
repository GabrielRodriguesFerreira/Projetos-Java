import java.text.DecimalFormat;
import java.util.Scanner;

public class Impostos{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o valor da sua venda: ");
        double valorVenda = sc.nextDouble();

        double custoProduto = valorVenda / 2; 
        double valorImpostos = valorVenda * 0.2; 
        double valorComissao = valorVenda * 0.1; 
        double valorLucroVista = valorVenda - custoProduto - valorImpostos - valorComissao - (valorVenda * 0.1); 
        double valorLucroPrazo = valorVenda - custoProduto - valorImpostos - valorComissao - ((valorVenda * 5)/100); 
        
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        System.out.println("Valor de venda: " + df.format(valorVenda));
        System.out.println("Custo do produto: " + df.format(custoProduto));
        System.out.println("Valor dos impostos: " + df.format(valorImpostos));
        System.out.println("Comissão do vendedor: " + df.format(valorComissao));
        System.out.println("Valor do lucro à vista: " + df.format(valorLucroVista));
        System.out.println("Valor do lucro a prazo: " + df.format(valorLucroPrazo));
    }
}
