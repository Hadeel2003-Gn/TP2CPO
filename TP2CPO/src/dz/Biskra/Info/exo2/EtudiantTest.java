package dz.Biskra.Info.exo2;



import java.time.LocalDate;

public class EtudiantTest {

   
    public void test_calcul_moyenne_retourne_zero_Quand_Pas_De_Note() {
        Etudiant etudiant = new Etudiant("Dupont", "Jean", LocalDate.now(), "jean@example.com", "1 rue de Paris");
        assertEquals(0.0, etudiant.calculerMoyenne(), 0.01);
    }

    private void assertEquals(double d, double calculerMoyenne, double e) {
		// TODO Auto-generated method stub
		
	}

	
    public void test_calcul_moyenne_retourne_valeur_note_quand_une_seule_note() {
        Matiere matiere = new Matiere("Mathématiques", 2.0);
        Etudiant etudiant = new Etudiant("Dupont", "Jean", LocalDate.now(), "jean@example.com", "1 rue de Paris");
        etudiant.noter(matiere, 14);
        assertEquals(14.0, etudiant.calculerMoyenne(), 0.01);
    }

    
    public void test_calcul_moyenne_retourne_valeur_note_pondérée_quand_une_seule_note_avec_coefficient() {
        Matiere matiere = new Matiere("Mathématiques", 2.0);
        Etudiant etudiant = new Etudiant("Dupont", "Jean", LocalDate.now(), "jean@example.com", "1 rue de Paris");
        etudiant.noter(matiere, 14);
        assertEquals(14.0, etudiant.calculerMoyenne(), 0.01);
    }

   
    public void test_calcul_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
        Matiere matiere1 = new Matiere("Mathématiques", 2.0);
        Matiere matiere2 = new Matiere("Physique", 1.0);
        Etudiant etudiant = new Etudiant("Dupont", "Jean", LocalDate.now(), "jean@example.com", "1 rue de Paris");
        etudiant.noter(matiere1, 14);
        etudiant.noter(matiere2, 16);
        assertEquals(14.67, etudiant.calculerMoyenne(), 0.01);
    }
}
