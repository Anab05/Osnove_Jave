package d26_08_2022;

public class Trener extends Osoba{
	
	private int godIskustva;
	private String tipTrenera;
	public Trener(String punoIme, String jmbg, String godRodjenja, int godIskustva, String tipTrenera) {
		super(punoIme, jmbg, godRodjenja);
		this.godIskustva=godIskustva;
		this.tipTrenera=tipTrenera;
	}

	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Godine iskustva: "+godIskustva );
		System.out.println("Tip trenera: "+tipTrenera);
	}
}
