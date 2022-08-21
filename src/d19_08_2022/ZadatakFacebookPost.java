package d19_08_2022;

public class ZadatakFacebookPost {

	public static void main(String[] args) {
		FacebookPost f1=new FacebookPost("Ana Brankovic","Pera Peric","Poyyyyy");
		f1.Like();
		f1.Like();
		f1.Like();
		f1.Like();
		f1.disLike();
		f1.Share();
		f1.Share();
		f1.print();
		
		FacebookPost f2=new FacebookPost("Nikola Nikolic","Janko Jankovic","Yo man");
		f2.Like();
		f2.Like();
		f2.Share();
		f2.Share();
		f2.print();

	}

}
