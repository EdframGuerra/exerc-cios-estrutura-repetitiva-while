import java.util.Scanner;

public class ExecWhile01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int senha = leitor.nextInt();

        while (senha != 2002) {
            System.err.println("Senha invalida");
            senha = leitor.nextInt();
        }

        System.out.println("Acesso permitido");

        leitor.close();
    }
}