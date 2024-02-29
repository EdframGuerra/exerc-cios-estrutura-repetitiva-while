import java.util.Scanner;

public class ExecWhile02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double x, y;

        x = leitor.nextInt();
        y = leitor.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro");

            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
            x = leitor.nextInt();
            y = leitor.nextInt();
        }

        leitor.close();
    }
}
