
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arbol arbolito=new Arbol();
		System.out.println("Datos del Objeto Arbol: ");
		
		arbolito.crecer();
		arbolito.crearHojas();
		arbolito.fotosintesis();
		
		
		
		System.out.println(arbolito.tipo);
		System.out.println(arbolito.cantidadHojas+" hojas");
		System.out.println(arbolito.antiguedad+" años");
		System.out.println(arbolito.altura+" metros");
		
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		
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
