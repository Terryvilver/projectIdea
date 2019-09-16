package gestionEleves;

public class Eleve{
    protected String nom;
    protected int listeNotes[] = new int[5];
    protected double moyenne;

    public Eleve()
    {
        nom = "";
        int listeNotes[] = {0,0,0,0,0};
        moyenne = 0;
    }
    
}