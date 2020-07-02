
public class Book extends Magazine {
	private String isbn;
	private int timeReaded;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getTimeReaded() {
		return timeReaded;
	}

	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}

	public void read() {
		System.out.println("ID: "+ getId()+"\nTitulo: "+getTitle()+"\nEdición: "+getEdition()+"\nEditorial: "+getEditorial()+"\nAutor: "+getAutor()+"\nISBN: "+getIsbn()+"\nTiempo de Lectura: "+getTimeReaded());
		
	}
	

	public Book() {
		// TODO Auto-generated constructor stub
	}

}
