
package numeropositivonegativo;
import java.util.Scanner;

public class Positivonegativonumber {
	 Scanner teclado =new Scanner(System.in);

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		//Pedir un numero e indicar si es positivo o negativo
		
		//calculamos variables
		int x;
		
		
		//Ingreso de datos
		System.out.println("Ingrese el  Numero :");
		x=teclado.nextInt();
		
		//if
		if(x>0 ) {
			System.out.println("El numero es Positivo");
		}else {
			System.out.println("El numero es  Negativo");
		}

	}

}
