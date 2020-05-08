
import java.util.Scanner;
public class caso2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1, num = 0, sum = 0;
		
		System.out.print("Ingrese número: ");
		num = sc.nextInt();
		
		while(c<=num) {
			sum+=c;
			c++;
		}
		System.out.println("La sumatoria de "+num+" es: "+ sum);
	}

}