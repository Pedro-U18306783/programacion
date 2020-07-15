
public class Empresa extends Empleado {
	
	protected int contador;
	protected double aumentosueldo;
	protected String despido;
	
	
	
	
	public String getDespido() {
		return despido;
	}


	public void setDespido(String despido) {
		this.despido = despido;
	}


	public double getAumentosueldo() {
		return aumentosueldo;
	}


	public void setAumentosueldo(double aumentosueldo) {
		this.aumentosueldo = aumentosueldo;
	}


	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}


	public void String() {
		System.out.println("Empresa: "+getEmpresa()+"\nNombre: "+getNombre()+"\nSueldo: "+getSueldo()+" dolares"+"\nNumero de empleado: "+getContador());
		
	}
	
	public void aumentarsueldo() {
		aumentosueldo=sueldo+sueldo*0.60;
		System.out.println("\nAumento de sueldo es: "+getAumentosueldo()+" dolares");
	}
	
	public void despedir() {
		System.out.println("\nEmpleado Despedido es: "+getDespido());
		
	}
		
	
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}

}
