
package arearadiocirculo;

import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
		
		
		
		//Pedir el radio de un circulo y calular su area A=PI*r2
		
		//calculamos variables
		final double PI=3.14159;
		double radio,areaCirculo;
		//Ingreso
		System.out.println("Ingrese el Radio :");
		Scanner teclado =new Scanner(System.in);
		radio=teclado.nextDouble();
		//area del circulo
		areaCirculo=(Math.pow(radio,2));
		//mostrar resultado
		System.out.println("Area del Circulo es: "+areaCirculo);
		
		
		
		
		

	}

}
