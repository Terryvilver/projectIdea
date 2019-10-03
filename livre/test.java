/* https://www.exelib.net/csharp-poo/la-classe-livre.html */

import classe.Livre;
import java.util.Scanner;

public class test{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        Livre l1 = new Livre();
        Livre l2 = new Livre();

        //1er livre
        System.out.println("Livre 1:");
        System.out.print("Donner le titre: ");
        l1.setTitre(scan.nextLine());
        System.out.print("Donner l'auteur: ");
        l1.setAuteur(scan.nextLine());
        System.out.print("Donner le prix: ");
        l1.setPrix(scan.nextInt());

        scan.nextLine();

        System.out.println("Le titre est " + l1.getTitre());
        System.out.println("L'auteur est " + l1.getAuteur());
        System.out.println("le prix est " + l1.getPrix());
        l1.afficher();

        //2e livre
        System.out.println("Livre 2:");
        System.out.print("Donner le titre: ");
        l2.setTitre(scan.nextLine());
        System.out.print("Donner l'auteur: ");
        l2.setAuteur(scan.nextLine());
        System.out.print("Donner le prix: ");
        l2.setPrix(scan.nextInt());
        l2.afficher();
    }
}