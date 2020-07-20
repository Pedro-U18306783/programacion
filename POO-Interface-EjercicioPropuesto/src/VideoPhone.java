
public class VideoPhone implements Phone{
	private int anexo;
	private String trans;
	
	

	public int getAnexo() {
		return anexo;
	}

	public void setAnexo(int anexo) {
		this.anexo = anexo;
	}

	public String getTrans() {
		return trans;
	}

	public void setTrans(String trans) {
		this.trans = trans;
	}

	public VideoPhone() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dialNumber() {
		// TODO Auto-generated method stub
		System.out.println("Marque el Anexo: "+getAnexo());
		
	}

	@Override
	public boolean isCallingProgress() {
		// TODO Auto-generated method stub
		System.out.println("\nEstado de LLamada: "+getTrans());
		return false;
	}

}
