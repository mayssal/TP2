package exercice1;

public class rectangle {
	//les attributs:
	private double largeur;
	private double longueur;
	
	//constructeurs:
	public rectangle (double largeur, double longueur) {
		this.largeur= largeur;
		this.longueur= longueur;	
	}
	
	//methodes:
	public double calculersurface() {
		return largeur*longueur;
	}
}
