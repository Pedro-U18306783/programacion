import java.util.Scanner;
public class igualdadnumeros {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		
		//Pedir dos numeros y decir si son iguales o no
		
		//calculamos variables
		int x;
		int y;
		
		//Ingreso de datos
		System.out.println("Ingrese el Primer Numero :");
		x=teclado.nextInt();
		System.out.println("Ingrese el Segundo Numero :");
		y=teclado.nextInt();
		//if
		
		if(x==y) {
			System.out.println("Los Numeros son iguales");
		}else {
			System.out.println("Los Numeros son diferentes");
		}
		

	}

}
