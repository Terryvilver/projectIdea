//Elaboration d'une borne de banque


import pack.*;
import java.util.Scanner;

public class TestCompte{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int test; //permet de déterminer si l'on continue de rester dans le (do while) en cas d'erreur de saisie de l'utilisateur.
        int decision; // choix si l'utilisateur souhaite effectuer un retrait, dépôt ou quitter.
        char reponse; // permet de répondre à la question pour quitter ou rester dans le programme.
        Compte c = new Compte(1000);  

        c.afficher();
        do{
            System.out.println("Quel opération voulez-vous effectuer ? (1.Pour retirer. 2.Pour déposer. 3.Pour quitter.) ");
            System.out.print("Votre réponse : ");
            decision = scan.nextInt();

            if(decision == 1)
            {
                System.out.println("Combien voulez-vous retirer ? ");
                System.out.print("Votre réponse : ");
                c.retirer(scan.nextDouble());
                c.afficher();
            }
            else if(decision == 2)
            {
                System.out.println("Combien voulez-vous déposer ? ");
                System.out.print("Votre réponse : ");
                c.deposer(scan.nextDouble());
                c.afficher();
            }
            else if(decision == 3)
            {

            }
            else
            {
                System.out.print("\n");
                System.out.println("Erreur !");
            }
            do
            {
                System.out.println("Voulez-vous effectuer une nouvelle opération ?\n('O' pour continuer sinon 'N' pour quitter.)");
                System.out.print("Votre réponse : ");
                reponse = scan.next().charAt(0);   
                if(reponse == 'O')
                    test = 1;
                else if(reponse == 'N')
                    test = 2; 
                else 
                    test = 3;
            }while(test == 3);

            System.out.print("\n");

        }while(reponse == 'O');
    }
}