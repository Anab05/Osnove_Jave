package d25_08_2022;

import java.util.ArrayList;

public class Student {
	private String brIndexa;
	private String punoImeStudenta;
	private String tipStudija;
	private ArrayList<Ispit> ispiti=new ArrayList<Ispit>();

	
	public Student() {
		
	}

	public Student(String brIndexa, String punoImeStudenta, String tipStudija) {
		 this.brIndexa = brIndexa;
		this.punoImeStudenta = punoImeStudenta;
		this.tipStudija = tipStudija;
	}


	public void dodajIspite(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public String getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}

	public String getPunoImeStudenta() {
		return punoImeStudenta;
	}

	public void setPunoImeStudenta(String punoImeStudenta) {
		this.punoImeStudenta = punoImeStudenta;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}
	
	public double prosecnaOcena() {
		double prolazneOcene = 0;
		int brProlaznih = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (ispiti.get(i).polozen() == true) {
				prolazneOcene = prolazneOcene + ispiti.get(i).getOcena();
				brProlaznih++;
			}
		}
		return (prolazneOcene/brProlaznih);
	}
	public void stampaj () {
		System.out.println(this.brIndexa + " - " + this.punoImeStudenta + " - " + this.tipStudija);
		System.out.println("Predmeti:");
		for (int i = 0; i < ispiti.size(); i++) {
			this.ispiti.get(i).stampaj();
		}
		System.out.println("Prosecna ocena: " + this.prosecnaOcena());
	}

}
