package d05_09_2022;

public class Menadzer extends Radnik {

	public Menadzer(String ime) {
		super(ime);
		
	}
	

	@Override
	public double plataRadnika() {
		int suma=0;
		for (int i = 0; i < sektori.size(); i++) {
			 suma=suma+this.sektori.get(i).getPlata();
		}
		return suma;
	}

}
