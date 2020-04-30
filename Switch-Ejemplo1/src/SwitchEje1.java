import java.util.Scanner;

public class SwitchEje1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("Ingrese su nota A");
		int notaA=teclado.nextInt();
		System.out.println("Ingrese su nota B");
		int notaB=teclado.nextInt();
		System.out.println("Ingrese su nota C");
		int notaC=teclado.nextInt();
		
		double promedio;
		
		promedio=(notaA*0.3+notaB*0.4+notaC*0.2);
			
		if(promedio >= 10.5) {
			System.out.println("El alumno está aprobado");
		}else {
			System.out.println("El alumno está desaprobado");
		}
		
		System.out.println("Su promedio es: "+promedio);

	}

}
