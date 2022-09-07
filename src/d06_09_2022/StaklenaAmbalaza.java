package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{
	private double kaucija;
	private boolean daLiImaKaucija;
	private double cena;
	
	
	public StaklenaAmbalaza() {
		super();
		
	}


	public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina, double kaucija, boolean daLiImaKaucija, double cena) {
		super(barkod, naziv, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.daLiImaKaucija = daLiImaKaucija;
		this.cena = cena;
	}


	
	
	public double getKaucija() {
		return kaucija;
	}


	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}


	public boolean isDaLiImaKaucija() {
		return daLiImaKaucija;
	}


	public void setDaLiImaKaucija(boolean daLiImaKaucija) {
		this.daLiImaKaucija = daLiImaKaucija;
	}


	public double getCena() {
		return cena;
	}


	public void setCena(double cena) {
		this.cena = cena;
	}


	@Override
	public double cenaArtikla() {
		if (daLiImaKaucija) {
			return cena*1.2+kaucija;
		}
		return cena*1.2;
	}

	@Override
	public void stampaj() {
		System.out.println("Proizvod "+naziv+" barcode "+barkod);
		System.out.println("Tezina pakovanja "+razlikaUTezini());
		System.out.println("Cena proizvoda "+cenaArtikla());
		System.out.println("Za proizvod ");
		if (daLiImaKaucija) {
			System.out.println("kaucija se placa");
		}else {
			System.out.println("kaucija se ne placa");
		}
		
	}

}
