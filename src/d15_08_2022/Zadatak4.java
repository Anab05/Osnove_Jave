package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Zadatak
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca
//
		licniPodaci(123456, "Ana", "Brankovic", "1994", true);
		
	}
	public static void licniPodaci(int jmbg, String name, String lastName, 
			String godRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime : " + name);
		System.out.println("Prezime : " + lastName);
		System.out.println("God. rodjenja : " + godRodjenja);
		System.out.println("Aktivan : " + aktivan);
	}

}
