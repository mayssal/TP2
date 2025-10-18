package exercice1;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Test du Cercle
        System.out.print("Entrez le rayon du cercle : ");
        double r = input.nextDouble();
        cercle c = new cercle(r);
        System.out.println("La surface du cercle est : " + c.CalculeSurface());


        // Test du Rectangle
        System.out.print("Entrez la longueur du rectangle : ");
        double longueur = input.nextDouble();
        System.out.print("Entrez la largeur du rectangle : ");
        double largeur = input.nextDouble();

        rectangle rect = new rectangle(longueur, largeur);
        System.out.println("La surface du rectangle est : " + rect.calculersurface());

        input.close();
    }
}
