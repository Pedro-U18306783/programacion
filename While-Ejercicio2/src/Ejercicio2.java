import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido
		
		Scanner scan=new Scanner(System.in);
		//declaracion de variables
		 int num,contadores=0;
		 
		 System.out.print("Introduce un número: ");
		 num=scan.nextInt();
		 
		 while(num>0) { // mayor a cero
			 
			 contadores++;
			 		
			 System.out.print("Introduce otro número: ");
			 num=scan.nextInt();
			 
		 }	 
		 
		 
		 System.out.println("En total se introducieron: "+contadores+ " numeros ");
		 
		 

	}

}
