import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("diga uma nota de 0 a 100: ");
        double nota = scanner.nextDouble();

        int sair = 0;

        while (sair != 3) {
            if ((nota >=90) && (nota <= 100)) {
                System.out.println("A sua nota é: A");

            } else if ((nota <= 89) && (nota >= 80)) {
                System.out.println("A sua nota é: B");

            } else if ((nota <= 79) && (nota >= 70)) {

                System.out.println("A sua nota é: C");
            } else if ((nota <= 69) && (nota > 60)) {

                System.out.println("A sua nota é: D");
            } else if (nota < 60) {

                System.out.println("A sua nota é: F");
            }

            System.out.println("Digite 3 para sair");
            sair = scanner.nextInt();
        }
    }
}
