package d06_09_2022;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
		
		ArrayList<Planinar> nizPlaninara=new ArrayList<Planinar>();
		
		PlaninarskiDom planinarskiDom=new PlaninarskiDom("Dom u tvrdjavi", 1978);
		RekreativniPlaninar rp=new RekreativniPlaninar(12, "Pera Peric", 35, "Niski", 1500);
		RekreativniPlaninar rp1=new RekreativniPlaninar(13, "Nikola Nikolic", 15, "Jablanicki", 2500);
		RekreativniPlaninar rp2=new RekreativniPlaninar(14, "Zoran Zoranovic", 20, "Niski", 1750);
		
		Alpinista al= new Alpinista(15, "Dragan Draganovic", 23);
		Alpinista al1=new Alpinista(16, "Ivan Ivanovic", 15);
		Alpinista al2=new Alpinista(17, "Jovan Jovanovic", 34);
		
		planinarskiDom.dodajPlaninara(rp);
		planinarskiDom.dodajPlaninara(rp1);
		planinarskiDom.dodajPlaninara(rp2);
		planinarskiDom.dodajPlaninara(al);
		planinarskiDom.dodajPlaninara(al1);
		planinarskiDom.dodajPlaninara(al2);
		
		planinarskiDom.izbaciPlaninara(16);
		
		planinarskiDom.stampajDom();
		
		System.out.println("Mesecni prihod od clanarina je: "+planinarskiDom.mesecniPrihod());
		System.out.println();
		rp.stampaj();
		System.out.println();
		al.stampaj();
		

	}

}
