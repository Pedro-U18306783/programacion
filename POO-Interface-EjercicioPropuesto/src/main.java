
public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone a=new CellPhone();
		a.setAnexo(12);
		a.setTrans("Transfiriendo al anexo 12");
		a.dialNumber();
		a.isCallingProgress();
		
		LandlinePhone b=new LandlinePhone();
		b.setAnexo(14);
		b.setTrans("Transfiriendo al anexo 14");
		b.dialNumber();
		b.isCallingProgress();
		
		VideoPhone c=new VideoPhone();
		c.setAnexo(15);
		c.setTrans("Transfiriendo al anexo 15");
		c.dialNumber();
		c.isCallingProgress();
		

	}

}
