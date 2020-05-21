import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escriba un diagrama de flujo tal que dado como datos 270 numeros enteros, obtenga la suma de los números
		//impares y el promedio de los numeros pares
		//Datos: NUM1,NUM2,...,NUM270
		
		Scanner scan=new Scanner(System.in);
		//declaracion de variables
		 int  num,impar=0,promediopar=0,par=0,residuo,i;
		 
		 for(i=1;i<=270;i++) {
			 System.out.println("Ingrese el NUM "+i+":");
			 num=scan.nextInt();
			 residuo=num%2;
			 	if(residuo==0) {
			 		par=par+num;
			 		promediopar=promediopar+1;
			 		
			 	}
			 	
			 	if(residuo!=0) {
			 		impar=impar+num;
			 	}
			 
			 
		 }
		 
		 par=par/promediopar;
		 System.out.println(" La suma de los numeros impares son: "+impar);
		 System.out.println(" El promedio de los numeros pares es: "+par);
		 System.out.println(" Los numeros pares fueron: "+promediopar);
		

	}

}
