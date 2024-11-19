package dz.Biskra.Info.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;
    private ArrayList<Note> notes; // Liste des notes

    // Constructeur
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
        this.notes = new ArrayList<>(); // Initialiser la liste des notes
    }

    // Méthode pour ajouter une note
    public void noter(Matiere matiere, double valeur) {
        Note note = new Note(matiere, valeur);
        notes.add(note);
    }

    // Méthode pour calculer la moyenne pondérée
    public double calculerMoyenne() {
        double sommeNotes = 0.0;
        double sommeCoefficients = 0.0;
        
        for (Note note : notes) {
            sommeNotes += note.getValeur() * note.getMatiere().getCoefficient();
            sommeCoefficients += note.getMatiere().getCoefficient();
        }
        
        return sommeCoefficients == 0 ? 0 : sommeNotes / sommeCoefficients; // Éviter la division par zéro
    }

	public void setNom(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
