
public class Humano {
	//atributos
		String genero, caracter;
		int edad;
		double altura;
		
		
		
		//metodos
		
		void hablar() {
			System.out.println("Todo el dia hablo por telefono");
			
		}
		
		void comer() {
			System.out.println("Como tres veces al dia");
			
		}
		
		void correr() {
			System.out.println("Salgo a correr a las 6:00 AM");
		}
		
		//contructores
			Humano(){
				
				System.out.println("Soy humano");
				
				this.altura=1.70;
				this.caracter="tranquilo";
				this.edad=23;
				this.genero="masculino";
			
		

			}

}
