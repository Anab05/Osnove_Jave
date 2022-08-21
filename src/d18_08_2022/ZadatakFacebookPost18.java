package d18_08_2022;

public class ZadatakFacebookPost18 {

	public static void main(String[] args) {
		FacebookPost18 post1=new FacebookPost18();
		post1.korisnik1="Pera Peric";
		post1.korisnik2="Nikola Nikolic";
		post1.text="Dobar dan!";
		post1.brLike=13;
		post1.brShare=1;
		
		post1.like();
		post1.disLike();
		post1.share();
		post1.print();
		
		FacebookPost18 post2=new FacebookPost18();
		post2.korisnik1="Jovan Jovanovic";
		post2.korisnik2="Ivan Ivanovic";
		post2.text="Dobro vece!";
		post2.brLike=25;
		post2.brShare=5;
		
		post2.like();
		post2.disLike();
		post2.share();
		post2.print();
	}

}
