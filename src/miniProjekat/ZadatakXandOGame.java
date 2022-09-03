package miniProjekat;

import java.util.Scanner;

public class ZadatakXandOGame {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		Player p1=new Player("Zoran Zoranovic");
		Player p2=new Player("Nikola Nikolic");
		
		
		XandOGame igra= new XandOGame(p1, p2);
		int pozicija;
		
		igra.startGame();
		
		while (igra.isGameOver()==true || igra.isWinnerO()==true || igra.isWinnerX()==true);{
			System.out.print("Unesite poziciju: ");
			pozicija=s.nextInt();
			if (igra.isValidMove(pozicija)==true && igra.isFieldFree(pozicija)==true) {
				igra.makeAMove(pozicija);
				igra.printTable();
			} else {
				System.out.println("Igrajte ponovo. Niste uneli validnu poziciju.");
			}
		}
		System.out.println();
		System.out.println("Rezultat je: "+ igra.gameScore());
		p1.print();
		p2.print();
		
	}
	// iskreno, nisam mogla da pohvatam da li je potrebno da se igrica desava iznova i iznova dok se ne dese svi scenariji moguci.
	// ali kontam da da, cim smo koristili while, sa while petljom sam na vi :D  
	// s obzirom da imamo isValidMove metodu, nisam skontala gde mogu dodatno da ubacim uslov da od 0 do 8 pita ponovo za poziciju.
	//sto kaze Vlada gubimo me xD
}
