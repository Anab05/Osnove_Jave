package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
		
		System.out.println(stampajVrednostZa10Vecu(2));
		System.out.println(stampajVrednostZa10Vecu(10));
		System.out.println(stampajVrednostZa10Vecu(14));
		System.out.println(stampajVrednostZa10Vecu(8));
		System.out.println(stampajVrednostZa10Vecu(12));

	}
	public static int stampajVrednostZa10Vecu(int n) {
		return n*10;
		
	}
}
