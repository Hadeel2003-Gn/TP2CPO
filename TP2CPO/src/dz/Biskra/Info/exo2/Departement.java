package dz.Biskra.Info.exo2;


import java.util.ArrayList;
public class Departement {
    // Attributs privés
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> etudiantsInscrits;

    // Constructeur
    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new ArrayList<>();
    }

    // Méthode pour inscrire un étudiant
    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    // Méthode pour désinscrire un étudiant
    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.remove(etudiant);
    }

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Département: ").append(specialite).append(", Adresse: ").append(adresse).append("\n");
        sb.append("Étudiants inscrits :\n");
        for (Etudiant etudiant : etudiantsInscrits) {
            sb.append(etudiant.toString()).append("\n");
        }
        return sb.toString();
    }
    
    public double getMoyennePromo() {
        double sommeMoyennes = 0.0;
        int nombreEtudiants = etudiantsInscrits.size();

        for (Etudiant etudiant : etudiantsInscrits) {
            sommeMoyennes += etudiant.calculerMoyenne();
        }

        return nombreEtudiants == 0 ? 0 : sommeMoyennes / nombreEtudiants; // Éviter la division par zéro
    }

}