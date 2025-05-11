import java.util.Scanner;

//Extrai o dígito da dezena de um número de 3 dígitos

public class ExtrairDezena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, dezena;

        System.out.print("Digite um valor com 3 dígitos (100 - 999): ");
        valor = sc.nextInt();

        dezena = valor / 10 % 10;

        System.out.println("dezena = " + dezena);

    }
}
