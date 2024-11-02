package dz.Biskra.Info.exo1;

import java.util.ArrayList;

public class GestionEtudiants {
    // Liste d'étudiants
    private ArrayList<Etudiant> etudiants;

    // Constructeur
    public GestionEtudiants() {
        etudiants = new ArrayList<>();
    }

    // Méthode pour ajouter un étudiant
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    // Méthode pour afficher tous les étudiants
    public void afficherEtudiants() {
        for (Etudiant etudiant : etudiants) {
            etudiant.afficherInfo();
            System.out.println("-----------------");
        }
    }
}