import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Obtener la edad promedio de un grupo N alumnos
		Scanner scan=new Scanner(System.in);
		
		int num,contador,suma;
		double promedio;
		suma=0;
		contador=0;
		
		System.out.println("Ingrese el numero de alumnos");
		num=scan.nextInt();
		
		do {
			System.out.println("Ingrese su edad");
			num=scan.nextInt();
			contador++;
			
			suma+=num;
			
			
		}while(contador<num);
		
		System.out.println(suma/num);
		

	}

}
