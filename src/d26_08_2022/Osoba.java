package d26_08_2022;

public class Osoba {
	protected String punoIme;
	protected String jmbg;
	protected String godRodjenja;
	
	

	public Osoba(String punoIme, String jmbg, String godRodjenja) {
		this.punoIme = punoIme;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getGodRodjenja() {
		return godRodjenja;
	}

	public void setGodRodjenja(String godRodjenja) {
		this.godRodjenja = godRodjenja;
	}
	
	public void stampaj() {
		System.out.print("Ime: "+punoIme+", "+jmbg+", god. rodjenja: "+godRodjenja);
	}
	
}
