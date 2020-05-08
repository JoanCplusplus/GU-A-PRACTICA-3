
import java.util.Scanner;
public class caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c=1,nm=0;
		
		while(c<=4) {
		System.out.println("Ingrese número "+c+": ");
		int n = sc.nextInt();
		
		if(n>nm) {
			nm=n;
		}
		
		c=c+1;
	}
		System.out.println("El número mayor es: "+nm);
	}
}
