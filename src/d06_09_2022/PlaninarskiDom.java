package d06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {
	private String nazivDoma;
	private int godOsnivanja;
	private ArrayList<Planinar> nizPlaninara=new ArrayList<Planinar>();
	
	
	public PlaninarskiDom() {
		
	}

	public PlaninarskiDom(String nazivDoma, int godOsnivanja) {
		super();
		this.nazivDoma = nazivDoma;
		this.godOsnivanja = godOsnivanja;
		}

	public String getNazivDoma() {
		return nazivDoma;
	}

	public void setNazivDoma(String nazivDoma) {
		this.nazivDoma = nazivDoma;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public void setGodOsnivanja(int godOsnivanja) {
		this.godOsnivanja = godOsnivanja;
	}

	public ArrayList<Planinar> getNizPlaninara() {
		return nizPlaninara;
	}
	
	public void dodajPlaninara(Planinar planinar) {
		this.nizPlaninara.add(planinar);
	}
//	public int uspesnoPopetiPlaninari(Planina planina) {
//		 nisam uradila ovo jer nisam skapirala bas sta tacno treba sa ovih 4000
//
//	}
 
		
	public void izbaciPlaninara(int id) {
		for (int i = 0; i < nizPlaninara.size(); i++) {
			if (nizPlaninara.get(i).getId()==id) {
				nizPlaninara.remove(i);
			}
		}
	}
	
	public void stampajDom() {
		System.out.println("Planinarski dom: "+nazivDoma+" osnovan "+godOsnivanja);
		System.out.println("ima uclanjenje planinare: ");
		for (int i = 0; i < nizPlaninara.size(); i++) {
			System.out.println(nizPlaninara.get(i).getPunoIme());
		}
	}
	
	public double mesecniPrihod() {
		double ukPrihod=0;
		for (int i = 0; i < nizPlaninara.size(); i++) {
			ukPrihod=ukPrihod+nizPlaninara.get(i).clanarina();
		}return ukPrihod;

	}		
	
}
