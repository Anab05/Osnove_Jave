package d22_08_2022;

public class ZadatakAutorKnjiga {

	public static void main(String[] args) {
		Autor autor=new Autor("Ivo","Andric");
		Knjiga knjiga=new Knjiga("4589 8545 4545","Prokleta avlija", 1986, autor);
		knjiga.getAutor();
		knjiga.stampaj();
	}

}
