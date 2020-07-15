
public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ordenador pc=new Ordenador();
		
		pc.setNombre("ATX");
		pc.setCodigo(001);
		pc.setPrecio(1000);
		pc.setPeso(30);
		pc.setSlogan("Es el que más pesa, pero el que menos cuesta");
		pc.setDescripcion("Apto para Gamers y administrador de servidores"); 
		
		pc.mostrando();
		
		pc.setNombre("Yoga Lenovo");
		pc.setCodigo(002);
		pc.setPrecio(2000);
		pc.setPeso(5);
		pc.setSlogan("Ideal para sus viajes");
		pc.setDescripcion("Laptop portatil-Procesador i7"); 
		
		pc.mostrando();
		

	}

}
