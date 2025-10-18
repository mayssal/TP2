package exercice2;
import java.util.Scanner;

public class nombrepair {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Donner un nombre entier: ");
		if (input.hasNextInt()) {
			int nombre = input.nextInt();
			System.out.println("Le nombre est: " + nombre);
			if(nombre % 2 == 0)
				System.out.print("Le nombre est pair!");
			else
				System.out.print("Le nombre est impair!");
		}else {
			System.out.print("ERREUR!I l faut entrer un entier!!!");
			
			
		}
	}
		
}
