package d16_08_2022;

public class SmartAirConditioning {
//	Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu 
//		atribut za mod (hladi/greje) - string
//		metodu za stampu (proizvoljno)
//		metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. 
//		Metoda kao parametar prima temperaturu koja je napolju.

	public String marka;
	public double temp;
	public String mode;
	
	public void stampa() {
		System.out.println("Klima uredjaj marke " +marka+ " za izabranu temperaturu "+temp+" ulazi u mode da "+mode);
	}
	public double temperatura(double spoljasna) {
		if (spoljasna>temp) {
		return spoljasna;
		}
		return temp;
	}
}
