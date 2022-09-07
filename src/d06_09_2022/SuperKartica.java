package d06_09_2022;

public class SuperKartica {
	protected String brKartice;
	protected String imeVlasnika;
	protected int popust;
	
	
	public SuperKartica() {
		
	}

	public SuperKartica(String brKartice, String imeVlasnika, int popust) {
		
		this.brKartice = brKartice;
		this.imeVlasnika = imeVlasnika;
		this.popust = popust;
	}

	public String getBrKartice() {
		return brKartice;
	}

	public void setBrKartice(String brKartice) {
		this.brKartice = brKartice;
	}

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void printKartica() {
		System.out.println(brKartice+", "+imeVlasnika);
	}
	
	
}
