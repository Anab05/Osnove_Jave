package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
	
	Igrac i1=new Igrac("Pera Peric", "15054944545", "1995", 7, "Napadac", false);
	Igrac i2=new Igrac("Zlatan Zlatanovic", "446848674", "1987", 10, "Odbrambeni", false);
	Igrac i3=new Igrac("Nikola Nikolic", "584684786", "1990", 5, "Napadac", true);
	
	i1.stampaj();
	i2.stampaj();
	i3.stampaj();
	
	Trener t1=new Trener("Zoran Zoranovic", "15458485", "1970", 15, "kondicioni");
	Trener t2=new Trener("Jovan Jovanovic", "5644", "1981", 8, "pomocni");
	Trener t3=new Trener("Janko Jankovic", "4445878", "1985", 12, "glavni");
	t1.stampaj();
	t2.stampaj();
	t3.stampaj();
	}

}
