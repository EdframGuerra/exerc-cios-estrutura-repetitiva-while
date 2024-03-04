import java.util.Scanner;

public class ExecFor04 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        
        for (int i=0; i<n; i++) {
            
            int x = leitor.nextInt();
            int y = leitor.nextInt();
            
            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        
        leitor.close();
    }
}
