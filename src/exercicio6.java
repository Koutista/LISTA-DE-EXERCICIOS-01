import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

/* 6. Ler o raio de um círculo e exibir a área e o perímetro. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do raio");
        double raio = sc.nextDouble();
        double area = 3.14 * raio * raio;
        double perimetro = 2 * raio * 3.14;

        System.out.printf("A área é %.2f\n",area);
        System.out.printf("O perimetro é %.2f",perimetro);


    }
}
