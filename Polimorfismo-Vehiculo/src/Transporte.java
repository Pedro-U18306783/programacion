
public class Transporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehiculo misfierros[]=new vehiculo[4];
		
		misfierros[0]=new vehiculo("HH64","Ferrari","A80");
		misfierros[1]=new vehiculoturismo(3,"HH60","Ferrari","A88");
		misfierros[2]=new vehiculodeportivo(600,"HH61","Ferrari","A88");
		misfierros[3]=new vehiculofurgoneta(3000,"HH65","Toyota","A89");
		
		for (vehiculo vehiculitos: misfierros ) {
			System.out.println(vehiculitos.mostrarDatos());
			System.out.println("");
			
		}
		
		
		

	}
	
	
	public Transporte() {
		// TODO Auto-generated constructor stub
	}

	
	
	//CLASE PADRE
	static class vehiculo{
		private String matricula;
		private String marca;
		private String modelo;
		
		
		public vehiculo(String matricula, String marca, String modelo) {
			this.matricula=matricula;
			this.marca=marca;
			this.modelo=modelo;
		}

		public String getMatricula() {
			return matricula;
		}
		
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public String mostrarDatos() {
			return "Matricula es: "+matricula+"\nMarca es: "+marca+"\nModelo es: "+ modelo;
			
			
		}
		
		
		
	}
	
	static class vehiculoturismo extends vehiculo{
		private int numeroPuertas;

		public vehiculoturismo(int numeroPuertas,String matricula, String marca, String modelo) {
			super(matricula,marca,modelo);
			this.numeroPuertas=numeroPuertas;
		}

		public int getNumeroPuertas() {
			return numeroPuertas;
		}

		public void setNumeroPuertas(int numeroPuertas, String matricula, String marca,String modelo) {
			this.numeroPuertas = numeroPuertas;
		}
		
		@Override
		public String mostrarDatos(){
			return "\nNumeroPuertas son: "+numeroPuertas;
			
			
		}
		
		
		
		
	}
	
	static class vehiculodeportivo extends vehiculo{
		private int cilindrada;

		public vehiculodeportivo(int cilindrada, String matricula, String marca, String modelo) {
			// TODO Auto-generated constructor stub
			super(matricula,marca,modelo);
			this.cilindrada=cilindrada;
		}

		public int getCilindrada() {
			return cilindrada;
		}

		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}
		
		@Override
		public String mostrarDatos(){
			return "\nCilindradas son: "+cilindrada;
			
			
		}
		
		
		
		
	}
	
	static class vehiculofurgoneta extends vehiculo{
		private int carga;

		public vehiculofurgoneta(int carga, String matricula, String marca, String modelo) {
			// TODO Auto-generated constructor stub
			super(matricula,marca,modelo);
			this.carga=carga;
		}

		public int getCarga() {
			return carga;
		}

		public void setCarga(int carga) {
			this.carga = carga;
		}
		
		@Override
		public String mostrarDatos(){
			return "\nLa carga es: "+carga;
			
			
		}
		
		
		
	}
	
	

}
