import java.util.Scanner;

public class ExecFor02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = leitor.nextInt();

            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        leitor.close();
    }
}
