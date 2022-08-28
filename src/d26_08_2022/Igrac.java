package d26_08_2022;

public class Igrac extends Osoba {
	private int brDresa;
	private String pozicija;
	private boolean kapiten;
	
	

	public Igrac(String punoIme, String jmbg, String godRodjenja, int brDresa, String pozicija, boolean kapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.brDresa = brDresa;
		this.pozicija = pozicija;
		this.kapiten=kapiten;
	}

	public int getBrDresa() {
		return brDresa;
	}

	public void setBrDresa(int brDresa) {
		this.brDresa = brDresa;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj dresa igraca: "+brDresa);
		System.out.println("Pozicija igraca: "+pozicija);
		if (kapiten==true) {
			System.out.println("Igrac je kapiten.");
		} 
	}	
	
	
	
}
