package gestionEleves;

public class Eleve{
    private String nom;
    private int listeNotes[] = new int[5];
    private double moyenne;

    public Eleve()
    {
        nom = "";
        int listeNotes[] = {0,0,0,0,0};
        moyenne = 0;
    }

    /*** ACCESSEUR ***/
    public double getMoyenne()
    {
        return this.moyenne;
    }

    public String getNom()
    {
        return this.nom;
    }

    public int [] getListeNotes()
    {
        return this.listeNotes;
    }

    public void ajouterNote(int note)
    {
        if(note < 0)
            note = 0;
        else if(note > 20)
            note = 20;
        else
        {
            //note garde la valeur imposé/.
        }
    }

    
}