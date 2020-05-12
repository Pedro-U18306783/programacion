
import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		int num;
		System.out.println("Introduzca un número");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		if(num==0) {
			System.out.println("El numero "+num+" es nulo");
		}else {
			if(num>0) {
				System.out.println("El numero "+num+" es positivo");
			}else {
				System.out.println("El numero "+num+" es negativo");
				
			}
		}

	}

}
