package d05_09_2022;

public class Magacioner extends Radnik {

	public Magacioner(String ime) {
		super(ime);
		
	}
	
	private double prosecnaPlata() {
		double ukPlata=0;
		for (int i = 0; i < sektori.size(); i++) {
			 ukPlata=ukPlata+sektori.get(i).getPlata();
		}
		return ukPlata=ukPlata/sektori.size()*0.5;
	}

		
	@Override
	public double plataRadnika() {
		
		 return prosecnaPlata()*sektori.size();
		
	}
	
}
