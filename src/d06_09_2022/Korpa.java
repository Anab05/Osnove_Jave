package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
	protected ArrayList<Ambalaza> nizAmbalaza=new ArrayList<Ambalaza>();
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		nizAmbalaza.add(ambalaza);
	}
	
	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			if (nizAmbalaza.get(i).getBarkod().equals(barkod)) {
				nizAmbalaza.remove(i);
			} 
		}
	}
}
