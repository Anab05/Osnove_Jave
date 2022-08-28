package d25_08_2022;

import java.util.ArrayList;

public class ZadatakStudentProfesora {

	public static void main(String[] args) {
		Ispit i1=new Ispit("Sociologija", 7, "Petko Petkovic");
		Ispit i2=new Ispit("Geografija", 5, "Zlatko Zlatkovic");
		Ispit i3=new Ispit("Engleski jezik", 9, "Zora Zoranovic");
		Ispit i4=new Ispit("Matematika", 10, "Ivan Ivanovic");
		ArrayList<Ispit> ispiti=new ArrayList<Ispit>();
		Student student=new Student("44007", "Dragan Draganovic", "osnovne");
		student.dodajIspite(i1);
		student.dodajIspite(i2);
		student.dodajIspite(i3);
		student.dodajIspite(i4);
		student.stampaj();
	}

}
