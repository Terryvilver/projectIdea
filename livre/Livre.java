package classe;
public class Livre{
    private String titre;
    private String auteur;
    private int prix;

    //CONSTRUCTEUR
    public Livre(){
        titre = "";
        auteur = "";
        prix = 0;
    }

    public Livre(String titre, String auteur, int prix){
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }

    //Getteur
    public String getTitre(){
        return this.titre;
    }

    public String getAuteur(){
        return this.auteur;
    }

    public int getPrix(){
        return this.prix;
    }

    //Setter
    public void setTitre(String titre){
        this.titre = titre;
    }

    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    public void setPrix(int prix){
        this.prix = prix;
    }

    //Methode D'instance
    public void afficher(){
        System.out.println("Titre: " + this.titre + ", Auteur: " + this.auteur + ", Prix: "+ this.prix);
    }
}