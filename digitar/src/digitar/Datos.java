package digitar;

import java.util.Scanner;
public class Datos {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese Apellido Paterno");
		String apePat=teclado.next();
		System.out.println("Ingrese Apellido Materno");
		String apeMat=teclado.next();
		System.out.println("Ingrese edad");
		int edad=teclado.nextInt();
		
		System.out.println("Apellidos: " + apePat + " "+ apeMat+", tiene "+edad+ " a\u00f1os");
		

	}

}
