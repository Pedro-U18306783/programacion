
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arbol arbolito=new Arbol();
		System.out.println("Datos del Objeto Arbol: ");
		
		arbolito.crecer();
		arbolito.crearHojas();
		arbolito.fotosintesis();
		
		
		
		System.out.println(arbolito.tipo);
		System.out.println(arbolito.cantidadHojas+"hojas");
		System.out.println(arbolito.antiguedad+"años");
		System.out.println(arbolito.altura+"metros");
		
		

	}

}
