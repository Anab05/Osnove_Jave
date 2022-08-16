package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. 
//		Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//		a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

		Proizvod p= new Proizvod ();
		p.naziv="Kafa";
		p.cena=206;
		p.tezina=151;
		p.stampaj();
		p.konvertuj("kg");
		//System.out.println(p.konvertuj("kg"));
		//System.out.println(p.konvertuj("t"));
		Proizvod p1=new Proizvod();
		p1.naziv="Secer";
		p1.cena=98;
		p1.tezina=2300;
		p1.stampaj();
		p1.konvertuj("t");
		
		Proizvod p2=new Proizvod();
		p2.naziv="So";
		p2.cena=108;
		p2.tezina=1700;
		p2.stampaj();
		p2.konvertuj("kg");
		
	}

}
