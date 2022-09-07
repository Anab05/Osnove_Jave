package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	protected String ime;
	protected ArrayList<Sektor> sektori=new ArrayList<Sektor>();
	
	
	public Radnik(String ime) {
		super();
		this.ime = ime;
	}
	

	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}



	public abstract double plataRadnika();
	
	public void zaposli(Sektor sektor) {
		this.sektori.add(sektor);
	}
	
}
