import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Obtener la suma X cantidades
		Scanner scan=new Scanner(System.in);
		
		int x,num,suma,c;
		suma=0;
		c=0;
		
		System.out.println("Ingrese el numero de terminos");
		num=scan.nextInt();
		
		
		do {
			System.out.println("Ingrese su numero");
			num=scan.nextInt();
			c++;
			
			suma+=num;
			
		}while(c<num);
		
		System.out.println(suma);
		
		
		
		

	}

}
