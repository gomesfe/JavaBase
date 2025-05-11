import java.text.DecimalFormat;
import java.util.Scanner;

//Cálculo de raiz a partir de expressão com cúbica e quadrada

public class CalculoRaizCubo {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.print("Informe o valor de x --> ");
        x = sc.nextDouble();

        y = Math.sqrt(Math.cbrt(x - 1.0 / 2));

        System.out.println("y = " + df.format(y));
    }
}
