package exercice1;

public class cercle {
	//attributs:
	private double rayon;
	final double PI =3.14;
	
	//constructeur:
	public cercle (double rayon) {
		this.rayon = rayon;
	}
	
	//methode:
	public double CalculeSurface() {
		return PI * rayon * rayon;
	}
	
}





