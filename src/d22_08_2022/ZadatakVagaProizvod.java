package d22_08_2022;

public class ZadatakVagaProizvod {

	public static void main(String[] args) {
		Proizvod proizvod=new Proizvod("2456","Banane", 112.0);
		Vaga vaga=new Vaga();
		vaga.setMernaJed("kg");
		vaga.setProizvod(proizvod);
		vaga.print(65);
	}

}
