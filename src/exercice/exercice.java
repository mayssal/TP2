package exercice;
import java.util.Scanner;

public class exercice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nom , prenom;
		int age;
		Double salaire;
		Double Salairemax = 0.0;
		
		String respond = "oui";
		
		do {
			System.out.print("Donner le nom de l'employer:");
			nom = input.nextLine();
			
			System.out.print("Donner le prénom de l'employer:");
			prenom = input.nextLine();
			
			System.out.print("Donner l'âge de l'employer:");
			age = input.nextInt();
			
			System.out.print("Donner le salaire de l'employer:");
			salaire = input.nextDouble();
			
			if (salaire > Salairemax) {
				Salairemax = salaire;
			}
			
			
			System.out.print("Voulez vous ajouter un autre employer? (répondre avec oui ou bien non)");
			respond = input.nextLine();
			
		
		}while (respond.equalsIgnoreCase("oui"));
		
		System.out.println("\nLe salaire le plus grand est: " + Salairemax + "DT");
		
		
	}

}
