
import java.util.Scanner;
public class caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c=0,ca=0,e=0;
		String cont="S",nom="",est="";
		
		while(cont.contentEquals("S")|| cont.contentEquals("s")) {
			c++;
			System.out.println("======================");
			System.out.println("Registro de datos "+c+":");
			System.out.println("======================");
			
			System.out.println("Nombre de participante: ");
			nom = sc.nextLine();
			System.out.println("Edad: ");
			e = sc.nextInt();
			
			if(e>=18) {
				est="Apto para votar";
				ca++;
			}
				else {
					est="Menor de edad";
				}
			System.out.println("Estado del participante: " + est);
			sc.nextLine();
			System.out.println("¿Desea registrar otro participante? <S/N>: ");
			cont = sc.nextLine();
			
		}
		System.out.println("R E S U M E N");
		System.out.println("Participantes registrados: "+c);
		System.out.println("Cantidad de participantes aptos para votar: "+ca);
	}

}
