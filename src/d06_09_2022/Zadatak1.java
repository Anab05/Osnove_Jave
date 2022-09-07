package d06_09_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		ArrayList<Ambalaza> nizAmbalaza=new ArrayList<Ambalaza>();
		Korpa korpa=new Korpa();
		SuperKartica sk=new SuperKartica("7895454", "Pera Peric", 10);
		
		Tetrapak t1=new Tetrapak("12345", "mleko", 100, 150, true, 100);
		Tetrapak t2=new Tetrapak("98745", "sok", 200, 250, false, 150);
		StaklenaAmbalaza staklo=new StaklenaAmbalaza("345678", "kisela voda", 150, 200, 20, true, 120);
		StaklenaAmbalaza staklo1=new StaklenaAmbalaza("498765", "pivo", 75, 125, 50, false, 85);
		
		korpa.dodajAmbalazu(t1);
		korpa.dodajAmbalazu(t2);
		korpa.dodajAmbalazu(staklo);
		korpa.dodajAmbalazu(staklo1);
		
		korpa.izbaciAmbalazu("345678");
		
		nizAmbalaza.add(staklo1);
		nizAmbalaza.add(staklo);
		nizAmbalaza.add(t2);
		nizAmbalaza.add(t1);
		
		double ukupnaCena=0;
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			ukupnaCena=ukupnaCena+nizAmbalaza.get(i).cenaArtikla();
		}
		System.out.println("Ukupna cena je: "+ukupnaCena);

	}

}
