package d15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
//		(Za vezbanje)
//		Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. 
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
		
		System.out.println("Najmanji broj je: " + numbers(5,3,9) );
		System.out.println("Najmanji broj je: " + numbers(1,7,4) );
		System.out.println("Najmanji broj je: " + numbers(7,5,2) );
	}
	public static int numbers(int a, int b, int c) {
		int min=c;
		if (b<min) {
			min=b;
		} else if (a<min) {
			min=a;
		} else {
			min=c;
		}
		return min;
		
		
	}

}
