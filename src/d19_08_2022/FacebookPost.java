package d19_08_2022;

public class FacebookPost {

	private String korisnik1;
	private String korisnik2;
	private String text;
	private int brLike;
	private int brShare;
	

	public FacebookPost() {
		
	}
	
	public FacebookPost(String korisnik1,String korisnik2, String text) {
		this.korisnik1=korisnik1;
		this.korisnik2=korisnik2;
		this.text=text;
	}

	public void Like() {
		this.brLike++;
	}
	public void disLike() { 
		this.brLike--;
		if (brLike<0) {
			brLike=0;
		} 
	}

	public void Share() {
		this.brShare++;
	}
	public void print() {
		System.out.println("(" + korisnik1 + ") >>> ("+korisnik2+")");
		System.out.println("("+ text + ")");
		System.out.println("Likes " + brLike + " | Shares "+ brShare);
	}

	
}
