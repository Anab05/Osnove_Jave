package d23_08_2022;

public class ZeleniKarton {
	private String punoImeStudenta;
	private String brIndexa;
	private String nazivPredmeta;
	private String punoImeProfesora;
	private int ocena;
	
	public ZeleniKarton() {
		
	}
	public ZeleniKarton(String punoImeStudenta, String brIndexa, String nazivPredmeta, String punoImeProfesora, int ocena) {
		this.punoImeStudenta=punoImeStudenta;
		this.brIndexa=brIndexa;
		this.nazivPredmeta=nazivPredmeta;
		this.punoImeProfesora=punoImeProfesora;
		this.ocena=ocena;
	}
	
	public ZeleniKarton(String nazivPredmeta, int ocena) {
		this.nazivPredmeta=nazivPredmeta;
		this.ocena=ocena;
	}
	public String getPunoImeStudenta() {
		return punoImeStudenta;
	}
	
	public void setPunoImeStudenta(String punoImeStudenta) {
		this.punoImeStudenta = punoImeStudenta;
	}
	public void setPunoImeProfesora(String punoImeProfesora) {
		this.punoImeProfesora = punoImeProfesora;
	}
	public String getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getPunoImeProfesora() {
		return punoImeProfesora;
	}
	
	
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public boolean jePolozen(int ocena) {
		if (ocena>5) {
			return true;
		}
		return false;
	}
	
	public void stampaj() {
		System.out.println(nazivPredmeta+" - "+ocena);
		System.out.println("Student: "+punoImeStudenta+", "+brIndexa);
		System.out.println("Profesor: "+punoImeProfesora);
	}
}
