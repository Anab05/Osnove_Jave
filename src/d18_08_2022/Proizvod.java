package d18_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezina;
	
	public void stampaj() {
		System.out.println("{{ "+naziv+" }}, {{ "+cena+" din}}, {{ "+tezina+" gr}}");
	}
	public void povecajCenu(double povecanje) {
		this.cena=cena+povecanje;
	}
	
	public double vratiCenuSaPopustom(double popust) {
		if ((this.cena+popust>cena)) {
			return popust;
		}
		return 0;
		
	}
	public int racunajPostarinu() {
		if (tezina<=100) {
			return 200;
		}else if (tezina<=500) {
			return 400;
		}else {
			return 1000;
		}
	}
}
