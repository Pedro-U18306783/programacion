import java.util.Scanner;
public class Cine {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		
		
		System.out.println("Ingrese su genero (hombre/mujer)");
		String genero=teclado.next();
		
		if(genero.equals("hombre")) {
			System.out.println("Bienvenido Caballero");
		}
		else {
			System.out.println("Bienvenida Bella Dama");
		}
		
		//variables
		double precio=0;
		
		System.out.println("Ingrese su Edad");
		int edad=teclado.nextInt();
		
		if(edad>6 && edad<=12) {
			precio=10;
			
		}else {
			if(edad>12 && edad<=60) {
				precio=20;
				}else {
					if(edad>60) {
						precio=15;
					}
		

				}
		}
		
		System.out.println("Se cobrará S/" +precio);
	
	}

}
