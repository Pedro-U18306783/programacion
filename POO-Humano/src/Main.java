
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humano humanito=new Humano();
		
		
		humanito.hablar();
		humanito.comer();
		humanito.correr();
		
		System.out.println("Mido "+humanito.altura+ " metros");
		System.out.println("Soy " +humanito.caracter);
		System.out.println("Tengo "+humanito.edad+ " años");
		System.out.println("Mi genero es "+humanito.genero);
		
		

	}

}
