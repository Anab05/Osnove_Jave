package d23_08_2022;

public class Racun {

	private String brojRacuna;
	private String punoIme;
	private double stanjeRacuna;

	public Racun(String brojRacuna, String punoIme, double stanjeRacuna) {
		this.brojRacuna = brojRacuna;
		this.punoIme = punoIme;
		this.stanjeRacuna = stanjeRacuna;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public double getStanjeRacun() {
		return stanjeRacuna;
	}

	public void menjamoStanje (double trazenaSuma) {
			this.stanjeRacuna = this.stanjeRacuna + trazenaSuma;
			if (stanjeRacuna<0) {
				stanjeRacuna=0;
			}
	}

	public void stampaj () {
		System.out.println(this.punoIme + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je " + this.stanjeRacuna + " rsd.");
		System.out.println();
	}
}
