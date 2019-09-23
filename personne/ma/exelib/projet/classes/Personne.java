//Classe mère de Employe et de Etudiant.
public class Personne{
    protected int id;
    protected String nom;
    protected String prenom;

    public Personne()
    {
        id = 0;
        nom = "";
        prenom = "";
    }

    public Personne(int id, String nom, String prenom)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String toString()
    {
        return this.id + ": Je suis " + this.nom + " " + this.prenom + ".";
    }

}