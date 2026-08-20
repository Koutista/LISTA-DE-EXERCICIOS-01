import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        /* 3. Ler um valor em reais e a cotação do dólar e exibir o valor convertido. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor a ser convertido");
        double real = sc.nextDouble();

        System.out.println("Qual a cotação do dolar?");
        double cotacao = sc.nextDouble();

        System.out.printf("Valor convertido é %.2f", real/cotacao);

    }
}

