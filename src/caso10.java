

import java.util.Scanner;
public class caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String continuar="S",nombre_mayor="",nombre_menor="",empleado_tardon="";
		float sueldo=0, bonificacion=0, sueldo_neto=0, porcentaje=0, descuento=0;
		
		
		float sueldo_mayor = 0, sueldo_menor = 999999999999f;
		int c=0,empleado_porcentaje = 0,mayor_tardanza=0;
		
		while(continuar.contentEquals("S")|| continuar.contentEquals("s")){
			
			c++;
			
			System.out.println("=================================");
			System.out.println("Resgistro de empleados ("+c+")");
			System.out.println("=================================");
			
			System.out.print("Empleado: "); String nombre=sc.nextLine();
			System.out.print("Horas trabajadas: "); int horas=sc.nextInt();
			System.out.print("Tarifa por hora: "); float tarifa=sc.nextFloat();
			System.out.print("Minutos de tardanza: "); int minutos=sc.nextInt();
			
			sueldo=horas*tarifa;
			
			if(horas<=50) {
				bonificacion=0;
			}
			if(horas>50 & horas<=60) {
				bonificacion=(sueldo*0.02f);
			}
			if(horas>60 & horas<=70) {
				bonificacion=(sueldo*0.08f);
			}
			if(horas>70 & horas<=80){
				bonificacion=(sueldo*0.13f);
			}
			if(horas>80) {
				bonificacion=(sueldo*0.15f);
			}
			
			if(minutos<=15) {
				descuento=0;
			}
			if(minutos>15 & minutos<=30){
				descuento=(sueldo*0.003f)*minutos;
			}
			if(minutos>30) {
				descuento=(sueldo*0.05f)*minutos;
			}
			
			sueldo_neto=sueldo+bonificacion-descuento;
			
			porcentaje=(horas*100/80);
			
			System.out.println("********************************");
			System.out.println("      R E S U L T A D O S");
			System.out.println("********************************");
			System.out.println("Sueldo bruto: s/"+sueldo);
			System.out.println("Bonificación: s/"+ bonificacion);
			System.out.println("Descuento: s/"+ descuento);
			System.out.println("Sueldo neto: s/"+ sueldo_neto);
			System.out.println("% Alcanzado: "+ porcentaje+"%");
			
			System.out.println("================================");
			System.out.print("¿Nuevo empleado? [S/N]: ");
			sc.nextLine();
			continuar=sc.nextLine();
			System.out.println("================================");
			
			if(sueldo_neto>sueldo_mayor) {
				sueldo_mayor=sueldo_neto;
				nombre_mayor=nombre;
			}
			if(sueldo_neto<sueldo_menor) {
				sueldo_menor=sueldo_neto;
				nombre_menor=nombre;
			}
			
			if(minutos>mayor_tardanza) {
				mayor_tardanza=minutos;
				empleado_tardon=nombre;
			}
			
			if(porcentaje>90) {
				empleado_porcentaje=empleado_porcentaje+1;
			}
			
		}
		
		System.out.println("-------------------------------");
		System.out.println("--- R E S U M E N ---");
		System.out.println("-------------------------------");
		
		System.out.println("Número de empleados: "+c);
		System.out.println("Sueldo neto mayor: s/"+sueldo_mayor+", pertenece a: "+nombre_mayor);
		System.out.println("Sueldo neto menor: s/"+sueldo_menor+", pertenece a: "+nombre_menor);
		System.out.println("Empleado con la mayor cantidad de minutos de tardanza: "+empleado_tardon+"("+mayor_tardanza+"min)");
		System.out.println("Cantidad de empleados con más del 90% de la meta: "+empleado_porcentaje);
	}
}
