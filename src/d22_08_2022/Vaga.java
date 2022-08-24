package d22_08_2022;

public class Vaga {
//	merna jedinica (kg ili lb)
//	proizvod (proizvod koji se meri)
//	TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//	default-ni konstuktor
//	getteri i setteri za sve atribute
//	metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//	metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//	               (sifra) - (naziv)
//	   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//	   Ukupno: (ukupna cena) 

	private String mernaJed;
	private Proizvod proizvod;
	
	public Vaga() {
		
	}

	public String getMernaJed() {
		return mernaJed;
	}

	public void setMernaJed(String mernaJed) {
		this.mernaJed = mernaJed;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	//Na racunanje cene utice i merna jedinica na koju je vaga podesena.
	public double sracunajCenu(double tezina) {
		if (mernaJed.equals("kg")) {
			return proizvod.getCenaPoKg()*tezina;
		}
		return proizvod.getCenaPoLb()*tezina;
	}
	// (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//	   Ukupno: (ukupna cena) 
	
	public void print(double tezina) {
		proizvod.stampaj();
		if (mernaJed.equals("kg")) {
			System.out.println(proizvod.getCenaPoKg()+" "+ mernaJed+" x "+ tezina);
		} else {
			System.out.println(proizvod.getCenaPoLb()+" "+ mernaJed+" x "+ tezina);
		}
		
	}
	
}
