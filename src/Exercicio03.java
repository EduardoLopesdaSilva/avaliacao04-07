import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você é estudante? (S para sim / N para não): ");
        String estudante = scanner.next();


        double tarifa = 4.00;
        double valorPagar;


        if (idade < 6 || idade > 65) {
            valorPagar = 0.0;
        } else if (estudante.equals("S") && (idade < 25))
        {
            valorPagar = tarifa / 2;
        } else {
            valorPagar = tarifa;
        }

        System.out.printf("O valor foi: " + valorPagar);
    }
}