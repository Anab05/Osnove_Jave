package d23_08_2022;

public class Transakcija {
	private String id;
	private Racun racunPosiljaoc;
	private Racun racunPrimalac;

	public Transakcija(String id, Racun racunPosiljaoc, Racun racunPrimalac) {
		this.id = id;
		this.racunPosiljaoc = racunPosiljaoc;
		this.racunPrimalac = racunPrimalac;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getRacunPosiljaoc() {
		return racunPosiljaoc;
	}

	public void setRacunPosiljaoc(Racun racunPosiljaoc) {
		this.racunPosiljaoc = racunPosiljaoc;
	}

	public Racun getRacunPrimalac() {
		return racunPrimalac;
	}

	public void setRacunDobija(Racun racunPrimalac) {
		this.racunPrimalac = racunPrimalac;
	}

	private double provizija(double trazenaVrednost) {
		if (trazenaVrednost > 4500) {
			return trazenaVrednost/100;
		}
		else {
			return 45;
		}
	}

	public void transakcija(double trazenaVrednost) {
		if (trazenaVrednost > 0) {
			if ((this.racunPosiljaoc.getStanjeRacun() - ((trazenaVrednost + provizija(trazenaVrednost))) >= 0)) {
				this.racunPrimalac.menjamoStanje(trazenaVrednost);
				this.racunPosiljaoc.menjamoStanje(-(trazenaVrednost + provizija(trazenaVrednost)));
			}
		}
	}

	public void stampaj() {
		System.out.println("ID transakcije: " + this.id);
		System.out.println("Racun sa: " + this.racunPosiljaoc.getPunoIme() + " - " + this.racunPosiljaoc.getBrojRacuna());
		System.out.println("Racun na: " + this.racunPrimalac.getPunoIme() + " - " + this.racunPrimalac.getBrojRacuna());
		System.out.println();
	}
}
