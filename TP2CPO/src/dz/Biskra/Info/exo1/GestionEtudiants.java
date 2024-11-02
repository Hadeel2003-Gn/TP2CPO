package dz.Biskra.Info.exo1;

import java.time.LocalDate;

public class GestionEtudiants {
    public static void main(String[] args) {
        // Création d'étudiants
        Etudiant lolo = new Etudiant("Dupont", "Jean", LocalDate.of(2000, 5, 20), "jean.dupont@example.com", "1 rue de Paris");
        System.out.println(lolo.toString()); // Affichage de lolo

        // Changement de nom
        lolo.setNom("Dupont-Bordeaux");
        System.out.println(lolo.toString()); // Affichage après changement de nom

        // Références d'objets
        Etudiant toto = lolo; // toto fait référence à lolo
        System.out.println("Avant changement via toto : " + lolo.toString());
        toto.setNom("Toto Dupont");
        System.out.println("Après changement via toto : " + lolo.toString()); // Modification répercutée sur lolo

        // Création de nouveaux étudiants
        Etudiant fifi = new Etudiant("Martin", "Claire", LocalDate.of(1999, 3, 15), "claire.martin@example.com", "2 avenue de Lyon");
        Etudiant riri = new Etudiant("Bernard", "Paul", LocalDate.of(2001, 7, 10), "paul.bernard@example.com", "3 boulevard de Marseille");

        // Création d'un département
        Departement monDepInfo = new Departement("Informatique", "Biskra");
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto); // toto référence lolo, donc lolo est ajouté encore une fois
        monDepInfo.inscrire(riri);

        // Affichage des étudiants inscrits
        System.out.println(monDepInfo.toString());

        // Désinscription de toto (référence lolo)
        monDepInfo.desinscrire(toto);
        System.out.println("Après désinscription de toto (qui est lolo) :");
        System.out.println(monDepInfo.toString());
    }
}