
public class Empresa {
	
	private String nombre;
	private int tamaño;
	

	
	public int getTamaño() {
		return tamaño;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Empresa(String nombre,int tamaño) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.tamaño=tamaño;
	}

}
