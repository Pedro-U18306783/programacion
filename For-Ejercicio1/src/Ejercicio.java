import java.util.Scanner;
public class Ejercicio {

	public static void main(String[] args) {
		//Un vendedor ha hecho una serie de ventas y desea conocer aquellas
		//de 200 o menos, las mayores a 200 pero inferiores a 400, y el
		//número de ventas de 400 o superiores a tal cantidad. Haga un
		//diagrama de flujo que le proporcione al vendedor esta información
		//después de haber leído los datos de entrada.
		
		Scanner scan = new Scanner(System.in);
		
		int num,i,con1,con2,con3;
		float venta;
		con1=0;
		con2=0;
		con3=0;
		
		System.out.println("Introduzca el numero de Ventas");
		num = scan.nextInt();
		
		for(i = 1; i<=num; i++){
			System.out.println("Introduzca la venta");
			venta=scan.nextInt();
			
			if(venta<=200) {
				con1+=1;
			}else {
				if (venta>200 && venta<400) {
					con2+=1;
				}else {
					con3+=1;
				}
			}
			
            
        }
		
		System.out.println("Numero de Ventas menores o igual a 200: ");
		System.out.println(con1);
		System.out.println("Numero de Ventas mayores a 200 y menores a 400: ");
		System.out.println(con2);
		System.out.println("Numero de Ventas Mayores a 400");
		System.out.println(con3);
		

	}

}
