package d18_08_2022;

public class FacebookPost18 {
	public String korisnik1;
	public String korisnik2;
	public String text;
	public int brLike;
	public int brShare;
	
	public void like() {
		this.brLike++;
	}
	public void disLike() {
		brLike--;
		if (brLike<0) {
			brLike=0;
		}
	}
	public void share() {
		this.brShare++;
	}
	public void print() {
		System.out.println(korisnik1 + " >>> " + korisnik2);
		System.out.println(text);
		System.out.println("Likes "+ brLike+ "| Shares "+ brShare);
	}
}
