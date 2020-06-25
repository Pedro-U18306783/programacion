
public class Arbol {
	//atributos
	String tipo;
	int cantidadHojas,antiguedad,altura;
	
	
	
	//metodos
	
	void crecer() {
		System.out.println("Necesitan se regadas diariamente");
		
	}
	
	void crearHojas() {
		System.out.println("Alguna Hojas se marchitan a lo largo del tiempo");
		
	}
	
	void fotosintesis() {
		System.out.println("Necesitan luz solar, CO2 y Agua");
	}
	
	//contructores
		Arbol(){
			
			//this->palabra reservada
			this.tipo="Pino";
			this.altura=45;
			this.antiguedad=100;
			this.cantidadHojas=300000;
		
	

		}
}
