package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//			Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena. 
//			Metoda kao parametar prima temperaturu koja je napolju.

		SmartAirConditioning klima=new SmartAirConditioning();
		klima.marka="Tesla";
		klima.temp=23;
		klima.mode="hladi";
		klima.stampa();
		klima.temperatura(35);
		SmartAirConditioning klima1=new SmartAirConditioning();
		klima1.marka="Vox";
		klima1.temp=29;
		klima1.mode="greje";
		klima1.stampa();
		klima1.temperatura(10);
		
	}

}
