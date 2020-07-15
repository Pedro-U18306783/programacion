
public class Ordenador extends Portatil{
	
	private String descripcion;
	private String nombre;
	
	
	
	

	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public String getDescripcion() {
		return descripcion;
	}





	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}





	
	
	
	public void mostrando() {
		
		System.out.println("\nNombre: "+ getNombre()+"\nCodigo: "+getCodigo()+ "\nPrecio: "+getPrecio()+" dolares"+"\nEslogan: "+getSlogan()+"\nDescripcion: "+getDescripcion());
		
	}




	public Ordenador() {
		// TODO Auto-generated constructor stub
	}

}
