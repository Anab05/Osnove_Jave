package d05_09_2022;

import java.util.ArrayList;

public class ZadatakMagacin {

	public static void main(String[] args) {
		ArrayList<Sektor> sektori=new ArrayList<Sektor>();
		Sektor prodaja=new Sektor("Magacioner", 75000);
		Sektor izrada=new Sektor("Menadzer", 100000);
	
		Magacioner magacioner=new Magacioner("Zoran Zoranovic");
		Menadzer menadzer=new Menadzer("Nikola Nikolic");
		
		magacioner.zaposli(izrada);
		menadzer.zaposli(prodaja);
		
		System.out.println("Radnik "+magacioner.ime+" radi za platu od "+magacioner.plataRadnika()
			+" u sektoru "+magacioner.sektori.get(0).getNaziv());
		System.out.println("Radnik "+menadzer.ime+" radi za platu od "+menadzer.plataRadnika()
			+" u sektoru "+menadzer.sektori.get(0).getNaziv());

		
		

	}

}
