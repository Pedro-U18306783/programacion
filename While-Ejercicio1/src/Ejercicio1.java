import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Leer un numero e indicar si es positivoy negativo. Si presionamos cero se cierra
		
		Scanner scan=new Scanner(System.in);
		//declaracion de variables
		 int num;
		 
		 System.out.print("Introduce un número: ");
		 num=scan.nextInt();
		 
		 while(num!=0) { // diferente de cero
		 
			 if(num>0)
		 		 System.out.println("El número es Positivo");
			 else
				 System.out.println("El número es Negativo");
			 
		
			 System.out.print("Introduce otro número: ");
			 num=scan.nextInt();
			 
		 }	 

	}

}
