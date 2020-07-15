
public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa empresita=new Empresa();
		
		empresita.setEmpresa("Sociedad Privada");
		empresita.setNombre("Juan Perez");
		empresita.setSueldo(450);
		empresita.setContador(100);
		
		empresita.String();
		
		empresita.aumentarsueldo();
		empresita.setDespido("Juan Perez");
		empresita.despedir();
		
		

	}

}
