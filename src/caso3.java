
import java.util.Scanner;
public class caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.print("Ingrese número: ");
	int num = sc.nextInt();
	
	if(num<=7) {
		
		int c=1, fac=1;
		
		while(c<=num) {
			fac *=c;
			
			c=c+1;
		}
		
		System.out.println("El factorial de "+num+" es: "+fac);
	}
	else {
		System.out.println("El número es superior de 7");
	}
	}
}