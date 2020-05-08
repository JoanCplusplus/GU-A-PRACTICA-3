
import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n,e,cont="S",ma="",pra="";
		float mp=0,mnp=20,pr=0,pa=0;
		int c=0,cs=0,sic=0;
		
		while (cont.contentEquals("S")||cont.contentEquals("s")) {
			c++;;
			System.out.println("=======================");
			System.out.println("Registro "+c+":");
			System.out.println("=======================");
		
			System.out.print("Nombre del alumno: ");
			n = sc.nextLine();
			System.out.print("Nota 1: ");
			int n1=sc.nextInt();
			System.out.print("Nota 2: ");
			int n2=sc.nextInt();
			System.out.print("Nota 3: ");
			int n3=sc.nextInt();
			System.out.print("Asistencia [1-12]: ");
			float as=sc.nextInt();
			
			pr= ((n1*0.2f)+(n2*0.3f)+(n3*0.5f));
			pa= (as*100/12);
			
			if(pr>=13 & pa>=70){
				e= "Obtiene certificado.";
				cs=cs+1;
			}
			else {
				e= "Sin certificado.";
				sic++;
			}
			
			if(pr>mp) {
				mp=pr;
				ma=n;
			}
			
			if(pr<mnp) {
				mnp=pr;
				pra=n;
			}
			
			System.out.println("========================");
			System.out.println("= R E S U L T A D O S =");
			System.out.println("========================");
		
			System.out.println("Promedio: "+pr);
			System.out.println("Asistencia: "+pa+"%");
			System.out.println("Estado: "+e);
			System.out.println("========================");
			System.out.println("¿Registrar otro? [S/N]: ");
			System.out.println("========================");
			sc.nextLine();
			cont = sc.nextLine();
		}
		
		System.out.println("----------------");
		System.out.println(" R E S U M E N ");
		System.out.println("----------------");
		
		System.out.println("Número de alumnos: "+c);
		System.out.println("Mayor promedio: "+mp+", pertenece a : "+ ma);
		System.out.println("Menor promedio: "+mnp+", pertenece a : "+ pra);
		System.out.println("Número de alumnos certificados: "+cs);
		System.out.println("Número de alumnos sin certificado: "+sic);

	}

}
