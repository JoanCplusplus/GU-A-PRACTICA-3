
import java.util.Scanner;
public class caso5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c=1; 
		int nm=99999999;
		
		while(c<=5) {
			System.out.println("Ingrese número "+c+": ");
			int n = sc.nextInt();
			
			if(n<nm) {
				nm=n;
			}
			
			c=c+1;
			
		}
		
		System.out.println("El número menor es: "+nm);
	}
}
