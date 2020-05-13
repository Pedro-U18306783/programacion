import java.util.Scanner;


public class Trabajador {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String categoria;
		double sueldo=0,MontoSueldo;
		
		System.out.println("Ingrese su sueldo");
        sueldo=scan.nextDouble();
		
		System.out.println("Ingrese la categoria del 1-4");
        categoria=scan.next();
        
        switch (categoria)
        {
            case "1": MontoSueldo=sueldo*1.15; break;
            case "2": MontoSueldo=sueldo*1.10; break;
            case "3": MontoSueldo=sueldo*1.08; break;
            case "4": MontoSueldo=sueldo*1.07; break;
            default:    
                MontoSueldo=0;
                System.out.println("Categoria no Valida");
            break;
        }
            
        System.out.println("El Monto de su sueldo es: " + MontoSueldo);
        

	}

}
