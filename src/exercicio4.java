import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        /* 4. Ler quatro notas bimestrais e exibir a média aritmética do aluno. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a terceira nota");
        double nota3 = sc.nextDouble();
        System.out.println("Informe a quarta nota");
        double nota4 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("A média é: " + media);

    }
}
