package dz.Biskra.Info.exo1;


	public class Etudiant {
		// Attributs privés
	    private String nom;
	    private String prenom;
	    private int age;
	    private String matricule;

	    // Constructeur
	    public Etudiant(String nom, String prenom, int age, String matricule) {
	        this.nom = nom;
	        this.prenom = prenom;
	        this.age = age;
	        this.matricule = matricule;
	    }

	    // Getters
	    public String getNom() {
	        return nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getMatricule() {
	        return matricule;
	    }

	    // Setters
	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public void setMatricule(String matricule) {
	        this.matricule = matricule;
	    }

	    // Méthode pour afficher les informations de l'étudiant
	    public void afficherInfo() {
	        System.out.println("Nom: " + nom);
	        System.out.println("Prénom: " + prenom);
	        System.out.println("Âge: " + age);
	        System.out.println("Matricule: " + matricule);
	    }
	}


