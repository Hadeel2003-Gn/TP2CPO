package dz.Biskra.Info.exo1;


import java.time.LocalDate;

public class Etudiant {
    // Attributs privés
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;

    // Constructeur
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
    }

    // Getter et Setter pour le nom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresseMail='" + adresseMail + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                '}';
    }
}