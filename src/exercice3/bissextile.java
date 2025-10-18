package exercice3;
import java.util.Scanner;

public class bissextile {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Donner une année: ");
		int annee = input.nextInt();
		
		boolean bissextile = (annee % 40 == 0 && annee % 100 !=0) || (annee % 400 == 0);
		
		if (bissextile)
			System.out.print(annee + " est bissextile!");
		else
			System.out.print(annee + " n'est pas bissextile!");
		
	}

}
