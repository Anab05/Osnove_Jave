package d06_09_2022;

public abstract class Planinar {
	protected int id;
	protected String punoIme;
	
	public Planinar(int id, String punoIme) {
		
		this.id = id;
		this.punoIme = punoIme;
	}

	public int getId() {
		return id;
	}

	public String getPunoIme() {
		return punoIme;
	}
	
	public abstract void stampaj();
	public abstract double clanarina();
	public abstract boolean uspesanUspon(Planina planina);
	
	
}
