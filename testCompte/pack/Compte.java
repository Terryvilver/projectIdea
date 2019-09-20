/*Création de la classe Compte contenant le montant du compte.
 Et les méthodes permettant de manipuler le montant.
 */

package pack;

public class Compte{
    private double solde;

    /*** CONSTRUCTEUR ***/
    public Compte(double solde)
    {
        this.solde = solde;
    }

    /*** ACCESSEUR ***/
    public double getSolde()
    {
        return this.solde;
    }

    /*** MUTATEUR ***/
    public void setSolde(double solde)
    {
        this.solde = solde;
    }

    /*** METHODE INSTANCE ***/
    public void deposer(double depot)
    {
        this.solde = this.solde + depot;
    }

    public void retirer(double retrait)
    {
        this.solde = this.solde - retrait;
    }

    public void afficher()
    {
        System.out.println("Le solde de votre compte est : " + this.solde + "\n");
    }

}