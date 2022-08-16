package d16_08_2022;

public class Proizvod {
//	Napisati klasu Proizvod koja ima atribute
//	naziv proizvoda (String)
//	cenu proizvoda (double)
//	težinu proizvoda u gramima. (double)
//		i metode:
//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//	konvertuj - metoda konvertuje tezinu u kilograme i tone. 
//	Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//	a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//	Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//	Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
	
	public String naziv;
	public double cena;
	public double tezina;
	
	public void stampaj() {
		System.out.println("{{"+ naziv +"}}, {{" + cena +"}}, {{"+ tezina+"}}");
	}
	public double konvertuj(String tezina1) {
		if (tezina1.equals("kg")) {
			return tezina/1000;
		} else if (tezina1.equals("t")){
			return tezina/100000;
		}
		return 0;
		
	}
}
