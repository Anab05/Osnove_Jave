package d25_08_2022;

public class Ispit {
	private String naziv;
	private int ocena;
	private String profesor;
	
	public Ispit(String naziv, int ocena, String profesor) {
		this.naziv = naziv;
		this.ocena = ocena;
		this.profesor = profesor;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getProfesora() {
		return profesor;
	}
	public void setProfesora(String profesor) {
		this.profesor = profesor;
	}
	public boolean polozen() {
		if (ocena>5) {
			return true;
		}else {
			return false;
		}
	}
	public void stampaj() {
		System.out.println(naziv+" - "+profesor+" - "+ocena);
	}
	
	
}
