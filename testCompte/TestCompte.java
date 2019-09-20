//TestCompte va effectuer les différents tests.

import pack.*;
import java.util.Scanner;

public class TestCompte{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        int decision;
        char reponse = 'O';
        Compte c = new Compte(1000);  

        c.afficher();
        do{
            System.out.println("Quel opération voulez-vous effectuer ? ");
            System.out.println("1.Pour retirer.\n2.Pour déposer.\n3.Pour quitter. ");
            decision = scan.nextInt();

            if(decision == 1)
            {
                System.out.println("Combien voulez-vous retirer ? ");
                c.retirer(scan.nextDouble());
                c.afficher();
            }
            else if(decision == 2)
            {
                System.out.println("Combien voulez-vous déposer ? ");
                c.deposer(scan.nextDouble());
                c.afficher();
            }
            else if(decision == 3)
            {

            }
            else
            {
                System.out.println("Erreur !");
            }
            System.out.println("Voulez-vous effectuer une nouvelle opération ?");
            reponse = scan.next().charAt(0);

        }while(reponse == 'O');
    }
}