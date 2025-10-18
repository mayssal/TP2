package exercice4;
import java.util.Scanner;

	public class calcula {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Entrez le premier nombre : ");
	        double a = input.nextDouble();
	        System.out.print("Entrez un opérateur (+, -, *, /) : ");
	        char operateur = input.next().charAt(0);
	        System.out.print("Entrez le deuxième nombre : ");
	        double b = input.nextDouble();
	        double resultat;
	        switch (operateur) {
	            case '+':
	                resultat = a + b;
	                break;
	            case '-':
	                resultat = a - b;
	                break;
	            case '*':
	                resultat = a * b;
	                break;
	            case '/':
	                if (b != 0)
	                    resultat = a / b;
	                else {
	                    System.out.println("Erreur : division par zéro !");
	                    input.close();
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Opérateur invalide !");
	                input.close();
	                return;
	        }
	        System.out.println("Le résultat est : " + resultat);
	        
	    }
	}



