package d22_08_2022;

public class Proizvod {
//		sifru proizvoda
//		naziv proizvoda
//		cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//		konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//		gettere i settere za sifru i naziv
//		setter za cenu po kilogramu
//		metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//		metodu getCenaLb koja vraca cenu za 1lb prozvoda
//		 		konverzija: 1 kg = 2.2046 lb
//		metodu koja stampa proizvod u formatu:
//		(sifra) - (naziv)
	
	private String sifra;
	private String naziv;
	private double cenaPoKg;
	
	public Proizvod(String sifra,String naziv,double cenaPoKg) {
		this.sifra=sifra;
		this.naziv=naziv;
		this.cenaPoKg=cenaPoKg;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setCenaPoKg(double cenaPoKg) {
		this.cenaPoKg = cenaPoKg;
	}
	public double getCenaPoKg() {
		return cenaPoKg;
	}
	public double getCenaPoLb() {
		return cenaPoKg/2.2046;
	}
	public void stampaj() {
		System.out.println(sifra + " - "+ naziv);
	}
	
}
