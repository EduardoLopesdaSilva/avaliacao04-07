import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do usuário:");
        String nome = scanner.next();

        System.out.println("Digite a senha:");
        String senha = scanner.next();

        String usuarioCerto = "admin";
        String senhaCerto = "1234";

        if (usuarioCerto.equals(nome) && senhaCerto.equals(senha)) {
            System.out.println("Login bem-sucedido.");
        } else {
            System.out.println("Login inválido. Conta bloqueada.");

        }
    }
}
