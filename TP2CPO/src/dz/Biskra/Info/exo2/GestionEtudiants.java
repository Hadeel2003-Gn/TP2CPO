package dz.Biskra.Info.exo2;

import java.time.LocalDate;

public class GestionEtudiants {
    public static void main(String[] args) {
        // Création de matières
        Matiere mathematiques = new Matiere("Mathématiques", 2.0);
        Matiere physique = new Matiere("Physique", 1.5);
        Matiere informatique = new Matiere("Informatique", 3.0);

        // Création d'étudiants
        Etudiant lolo = new Etudiant("Dupont", "Jean", LocalDate.of(2000, 5, 20), "jean.dupont@example.com", "1 rue de Paris");
        Etudiant fifi = new Etudiant("Martin", "Claire", LocalDate.of(1999, 3, 15), "claire.martin@example.com", "2 avenue de Lyon");
        Etudiant riri = new Etudiant("Bernard", "Paul", LocalDate.of(2001, 7, 10), "paul.bernard@example.com", "3 boulevard de Marseille");

        // Notation des étudiants
        lolo.noter(mathematiques, 14);
        lolo.noter(physique, 16);
        lolo.noter(informatique, 15);

        fifi.noter(mathematiques, 10);
        fifi.noter(physique, 12);
        fifi.noter(informatique, 14);

        riri.noter(mathematiques, 13);
        riri.noter(physique, 15);
        riri.noter(informatique, 16);

        // Création d'un département et inscription des étudiants
        Departement monDepInfo = new Departement("Informatique", "Biskra");
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(riri);

        // Affichage des étudiants inscrits
        System.out.println(monDepInfo);

        // Calcul des moyennes des étudiants
        System.out.println("Moyenne de " + lolo.getNom() + " : " + lolo.calculerMoyenne());
        System.out.println("Moyenne de " + fifi.getNom() + " : " + fifi.calculerMoyenne());
        System.out.println("Moyenne de " + riri.getNom() + " : " + riri.calculerMoyenne());

        // Calcul et affichage de la moyenne de toute la promo
        System.out.println("Moyenne de la promo : " + monDepInfo.getMoyennePromo());
    }
}