import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor que vc deseja pegar emprestado: ");
        double emprestado = scanner.nextDouble();

        System.out.println("Em quantas parcelas deseja ");
        double parcelas = scanner.nextDouble();

        System.out.println("Quanto que é o salário mensal que vc recebe");
        double salario = scanner.nextDouble();

        double valor = emprestado / parcelas;
        double limite = salario * 0.3;

        if (valor<=limite) {
            System.out.println("Empréstimo aprovado. Valor de cada parcela: " + valor);
        } else {
            System.out.println("Empréstimo reprovado. Parcela muito alta.”");
        }
        if (parcelas < 1 || parcelas > 24)  {
            System.out.println("Empréstimo reprovado. Número de parcelas inválido.");
        }
    }
}

