package d06_09_2022;

public class RekreativniPlaninar extends Planinar {

	private double tezinaOpreme;
	private String nazivOkruga;
	private double maxUspon;
	
	
	public RekreativniPlaninar(int id, String punoIme, double tezinaOpreme, String nazivOkruga, double maxUspon) {
		super(id, punoIme);
		this.tezinaOpreme=tezinaOpreme;
		this.nazivOkruga=nazivOkruga;
		this.maxUspon=maxUspon;
		
	}
	

	public double getTezinaOpreme() {
		return tezinaOpreme;
	}


	public String getNazivOkruga() {
		return nazivOkruga;
	}


	public double getMaxUspon() {
		return maxUspon;
	}


	@Override
	public void stampaj() {
		System.out.println("Rekreativac, ID: "+id);
		System.out.println("Ime i prezime: "+punoIme);
		System.out.println("Okrug: "+nazivOkruga);
	}

	@Override
	public double clanarina() {
		
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisina()>maxUspon-50*tezinaOpreme) {
			return false;
		}
		return true;
	}

}
