package etudiant_pack;

public class Etudiant
{
    private String nom;

    /*** CONSTRUCTEUR ***/
    Etudiant(String nom)
    {
        this.nom = nom;
    }

    /*** ACCESSEUR ***/
    public String getNom()
    {
        return nom;
    }

    /*** MUTATEUR ***/
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /*** METHODE D'INSTANCE ***/
    public void travailler()
    {
        System.out.println(this.nom + " se met au travail !");
    }

    public void seReposer()
    {
        System.out.println(this.nom + " se repose.");
    }

}