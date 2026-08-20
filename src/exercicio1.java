import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        /* 1. Ler o nome, a idade e a altura de uma pessoa e exibir uma única frase com os três
dados. */

        Scanner sc = new Scanner(System.in);

        System.out.println("informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Informe sua idade: ");

        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe sua altura: ");

        double altura = sc.nextDouble();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Você se chama " + nome +
                ", tem a idade de " + idade + " e mede " + altura + " de altura");
        System.out.println("--------------------------------------------------------------");

    }

}
