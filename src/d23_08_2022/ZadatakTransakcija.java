package d23_08_2022;

public class ZadatakTransakcija {

	public static void main(String[] args) {
		Racun racun1 = new Racun("125-3545104-70", "Nikola Nikolic", 50000);
		Racun racun2 = new Racun("169-246874765-65", "Pera Peric", 5000);

		racun1.stampaj();
		racun2.stampaj();

		Transakcija transakcija1 = new Transakcija("BC145", racun1, racun2);

		transakcija1.transakcija(20000);

		transakcija1.stampaj();

		racun1.stampaj();
		racun2.stampaj();

	}

}
