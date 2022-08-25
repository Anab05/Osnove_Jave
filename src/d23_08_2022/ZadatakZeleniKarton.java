package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

import p23_08_2022.Sastojak;

public class ZadatakZeleniKarton {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList<ZeleniKarton> ispiti=new ArrayList<ZeleniKarton>();
		ZeleniKarton ispit1=new ZeleniKarton("Pera Peric", "44007", "Sociologija", "Nikola Nikolic",7);
		ispit1.stampaj();
		ispit1.setPunoImeProfesora("Nikola Nikolic");
		ispit1.setPunoImeStudenta("Pera Peric");
		
		
		for (int i = 1; i < 11; i++) {
			System.out.print("Naziv predmeta: ");
			String naziv=s.next();
			System.out.print("Ocena: ");
			int ocena=s.nextInt();
			ZeleniKarton ispit=new ZeleniKarton(naziv,ocena);
			ispiti.add(ispit);
		}

		for (int i = 0; i < ispiti.size(); i++) {
			ispiti.get(i).stampaj();
		}
		//cilj mi je bio da ubacimo rucno 10 predmeta, bez onog klasicnog da ubacimo svaki ispit posebno i dodamo ga u niz
		//ali mucim se sa stampom posle jer vidim da negde ne setujem dobro ime za studenta i profesora da se ponavljaju.
		//pa ako moze pomoc oko toga; p.s. a mozda sam i omasila smisao zadatka :D
		

}
}