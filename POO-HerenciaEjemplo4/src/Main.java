
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book librito=new Book();
		
		librito.setId(1);
		librito.setTitle("El Principito");
		librito.setEdition("frances");
		librito.setEditorial("Reynal & Hitchcock");
		librito.setAutor("Antoine de Saint Exupéry");
		librito.setIsbn("978-84-7888-628-9");
		librito.setTimeReaded(30);
		
		librito.read();

	}

}
