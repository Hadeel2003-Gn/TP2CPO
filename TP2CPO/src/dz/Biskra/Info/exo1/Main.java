package dz.Biskra.Info.exo1;

public class Main {
	public static void main(String[] args) {
        // Création d'une instance de GestionEtudiants
        GestionEtudiants gestion = new GestionEtudiants();

        // Ajout d'étudiants
        gestion.ajouterEtudiant(new Etudiant("Gouni", "Hadeel Asma", 21, "05H03"));
        gestion.ajouterEtudiant(new Etudiant("Lamri Sahraoui", "Lina Farah", 21, "04L03"));

        // Affichage des étudiants
        gestion.afficherEtudiants();
    }
}
