
public class Empresa {
	
	private String nombre;
	private int tama�o;
	

	
	public int getTama�o() {
		return tama�o;
	}


	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Empresa(String nombre,int tama�o) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.tama�o=tama�o;
	}

}
