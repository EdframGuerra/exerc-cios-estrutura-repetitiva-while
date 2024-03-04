import java.util.Locale;
import java.util.Scanner;

public class ExecFor03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        for (int i = 0; i < n; i++) {

            double a = leitor.nextDouble();
            double b = leitor.nextDouble();
            double c = leitor.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        leitor.close();
    }

}
