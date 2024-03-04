import java.util.Scanner;

public class ExecFor07 {
    public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n = leitor.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		leitor.close();
	}
}
