package d06_09_2022;

public class Tetrapak extends Ambalaza{
	private boolean daLiSeReciklira;
	private double cena;
	
	public Tetrapak() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tetrapak(String barkod, String naziv, double netoTezina, double brutoTezina, boolean daLiSeReciklira,double cena) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.daLiSeReciklira=daLiSeReciklira;
		this.cena=cena;
	}
	

	public boolean isDaLiSeReciklira() {
		return daLiSeReciklira;
	}

	public void setDaLiSeReciklira(boolean daLiSeReciklira) {
		this.daLiSeReciklira = daLiSeReciklira;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public double cenaArtikla() {
		if (daLiSeReciklira) {
			return razlikaUTezini()*1.5+this.cena;
		}
		return this.cena;
	}

	@Override
	public void stampaj() {
		System.out.println("Proizvod "+naziv+" barcode "+barkod);
		System.out.println("Tezina pakovanja "+razlikaUTezini());
		System.out.println("Cena proizvoda "+cenaArtikla());
		System.out.println("Proizvod se ");
		if (daLiSeReciklira) {
			System.out.println("reciklira");
		}else {
			System.out.println("ne reciklira");
		}
	}

}
