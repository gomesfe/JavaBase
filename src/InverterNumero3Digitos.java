import java.util.Scanner;

//Inverte os dígitos de um número de 3 dígitos

public class InverterNumero3Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, valorInvertido;
        int centena, dezena, unidade;

        System.out.print("Informe um valor com 3 dígitos (100-999): ");
        valor = sc.nextInt();

        centena = valor / 100;
        unidade = valor % 10;
        dezena = valor % 100 / 10;
        valorInvertido = unidade * 100 + dezena * 10 + centena;

        System.out.println(valor + " invertido é: " + valorInvertido);
    }
}
