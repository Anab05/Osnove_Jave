package miniProjekat;

public class Player {
	
	protected String punoIme;

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public Player() {
		
	}

	public Player(String punoIme) {
		this.punoIme=punoIme;
	}
	public void print() {
		System.out.println("Ime i prezime igraca: "+this.punoIme);
	}
	
}
