package d06_09_2022;

public class Alpinista extends Planinar {
	protected int brPoena;

	public Alpinista(int id, String punoIme, int brPoena) {
		super(id, punoIme);
		this.brPoena=brPoena;
	}
	

	public int getBrPoena() {
		return brPoena;
	}


	public void setBrPoena(int brPoena) {
		this.brPoena = brPoena;
	}


	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: "+id);
		System.out.println("Ime i prezime: "+punoIme);
		System.out.println("Broj poena: "+brPoena);
	}

	@Override
	public double clanarina() {
		
		return 1500;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisina()<4000) {
			return true;
		}
		return false;
	}

}
