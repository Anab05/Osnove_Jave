package d18_08_2022;

public class ZadatakProizvod {

	public static void main(String[] args) {
		Proizvod p1=new Proizvod();
		p1.naziv="Cokolada";
		p1.cena=105;
		p1.tezina=100;
		p1.stampaj();
		p1.povecajCenu(45);
		System.out.println("Popust na cenu je:" + p1.vratiCenuSaPopustom(20));
		p1.racunajPostarinu();
		System.out.println("Postarina iznosi: "+p1.racunajPostarinu()+" din");
		
		Proizvod p2=new Proizvod();
		p1.naziv="Jogurt";
		p1.cena=95;
		p1.tezina=250;
		p1.stampaj();
		p1.povecajCenu(25);
		System.out.println("Popust na cenu je:" + p1.vratiCenuSaPopustom(0));
		p1.racunajPostarinu();
		System.out.println("Postarina iznosi: "+p1.racunajPostarinu()+" din");

	}

}
