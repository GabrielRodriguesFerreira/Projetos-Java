import java.text.DecimalFormat;

public class TrabalhoRaiz_A {
        public static void main(String[] args) {
            double u = 15/2 - 15 + Math.sqrt(3)/2;
            DecimalFormat formato = new DecimalFormat("#.##");
            String resultado = formato.format(u);
            System.out.println("u = " + resultado);
        } 
}
