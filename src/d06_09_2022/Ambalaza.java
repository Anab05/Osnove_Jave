package d06_09_2022;

public abstract class Ambalaza {
	protected String barkod;
	protected String naziv;
	protected double netoTezina;
	protected double brutoTezina;
	
	
	public Ambalaza() {
		super();
	}

	public Ambalaza(String barkod, String naziv, double netoTezina, double brutoTezina) {
		super();
		this.barkod = barkod;
		this.naziv = naziv;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}

	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}
	
	public double razlikaUTezini() {
		return this.brutoTezina-this.netoTezina;
	}
	
	public abstract double cenaArtikla();
	public abstract void stampaj();
	
	
	
}
