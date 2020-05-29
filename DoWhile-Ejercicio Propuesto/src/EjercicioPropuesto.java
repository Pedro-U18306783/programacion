import java.util.Scanner;
public class EjercicioPropuesto {

	public static void main(String[] args) {
		// Se requiere un algoritmno para determinar cúanto
		//ahorrará una persona en un *año*, si al final de 
		//cada mes deposita **variables cantidades**
		//de dinero; se requiere saber cuánto lleva ahorrado 
		//mes.
		
		int ahorro;
		int mes;
		int cantidad;
		
		ahorro=0;
		mes=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ingrese el monto: ");
		
		do {
			cantidad=scan.nextInt();
			ahorro=ahorro+cantidad;
			mes=mes+1;
			System.out.println("ahorro del mes "+mes+" es: "+cantidad);
			System.out.println("Ingrese el monto: ");
			
			//instrucciones
			
			
		}while(mes<=12);
		System.out.println("El ahorro final es "+ahorro);
		

	}

}
