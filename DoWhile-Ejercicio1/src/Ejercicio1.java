import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir numeros hasta que se teclee 0, mostrar la suma de los numeros introducidos
		Scanner scan=new Scanner(System.in);
		
		int num,suma;
		suma=0;
		
		do {
			System.out.println("Ingrese su numero");
			num=scan.nextInt();
			suma+=num;
		}while(num!=0);
		
		System.out.println(suma);
			

	}

}
