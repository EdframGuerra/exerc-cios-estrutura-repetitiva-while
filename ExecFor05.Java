import java.util.Scanner;

public class ExecFor05 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n = leitor.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		leitor.close();
	}
}