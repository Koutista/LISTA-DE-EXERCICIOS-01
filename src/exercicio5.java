import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        /* 5. Ler o valor da hora trabalhada e a quantidade de horas do mês. Calcular o salário
bruto, o desconto de 8 por cento de INSS e o salário líquido. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada");
        double valorHora = sc.nextDouble();
        System.out.println("Informe a quantidade de horas tranlhadas no mês");
        double qtdeHora = sc.nextDouble();
        double salarioBruto = (valorHora * qtdeHora);
        double inss = salarioBruto * 0.08;
        System.out.println("=================================================================");
        System.out.println("Boletim do RH:\n");
        System.out.println("O salário bruto " + salarioBruto);
        System.out.println("O desconto INSS " + inss);
        System.out.println("O salário liquído " + (salarioBruto - inss));
        System.out.println("=================================================================");


    }
}