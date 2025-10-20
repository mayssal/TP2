package exercice;

import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nom, prenom;
        int age;
        double salaire;
        double maxSalaire = 0;
        String reponse;

        do {
            System.out.print("Entrez le nom de l'employé : ");
            nom = input.nextLine();

            System.out.print("Entrez le prénom de l'employé : ");
            prenom = input.nextLine();

            System.out.print("Entrez l'âge de l'employé : ");
            age = input.nextInt();

            System.out.print("Entrez le salaire de l'employé : ");
            salaire = input.nextDouble();

            if (salaire > maxSalaire) {
                maxSalaire = salaire;
            }

            // vider le buffer pour permettre de répondre "oui" ou "non"
            input.nextLine();

            System.out.print("Voulez-vous ajouter un autre employé ? (oui/non) : ");
            reponse = input.nextLine();

        } while (reponse.equalsIgnoreCase("oui"));

        System.out.println("\nLe salaire le plus grand est : " + maxSalaire + " DT");

        input.close();
    }
}
