import java.util.Scanner;
public class Ejercicioo2 {

	public static void main(String[] args) {
//		Sup�ngase que en una reciente elecci�n hubo cuatro candidatos
//		(con identificadores 1, 2, 3, 4). Usted habr� de encontrar, mediante
//		un programa, el n�mero de votos correspondiente a cada candidato
//		y el porcentaje que obtuvo respecto al total de los votantes. El
//		usuario teclear� los votos de manera desorganizada, tal y como se
//		obtuvieron en la elecci�n, el final de datos est� representado por un
//		cero. Observe, como ejemplo, la siguiente lista:
//		13142214111213140 Donde 1 representa un voto para el candidato
//		1; 3 un voto para el candidato 3; y as� sucesivamente

		Scanner scan = new Scanner(System.in);
		int con1,con2,con3,con4,num,i;
		float a,b,c,d,suma;
		con1=0;
		con2=0;
		con3=0;
		con4=0;
		
		System.out.println("Yo voto por: ");
	    num = scan.nextInt();
		
		
			while(num!=0) {
				switch(num) {
					case 1:con1+=1; break;
					case 2:con2+=1; break;
					case 3:con3+=1; break;
					case 4:con4+=1; break;
					default:
				}
				
			}
			
			
		
		
		suma=con1+con2+con3+con4;
		a=(con1/suma)*100;
		b=(con2/suma)*100;
		c=(con3/suma)*100;
		d=(con4/suma)*100;
		
		System.out.println("Votos del Candidato 1: ");
		System.out.println(con1);
		System.out.println("Porcentaje de los Votos: ");
		System.out.println(a + "%");
		System.out.println("Votos del Candidato 2: ");
		System.out.println(con2);
		System.out.println("Porcentaje de los Votos: ");
		System.out.println(b + "%");
		System.out.println("Votos del Candidato 3: ");
		System.out.println(con3);
		System.out.println("Porcentaje de los Votos: ");
		System.out.println(c + "%");
		System.out.println("Votos del Candidato 4: ");
		System.out.println(con4);
		System.out.println("Porcentaje de los Votos: ");
		System.out.println(d + "%");
		
	}

}
