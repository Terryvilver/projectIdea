import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{

    static String positifOuNegatif(int nombre)
    {
        if(nombre > 0)
            return "positif";
        else
            return "négatif";
    }

    static String pairOuImpair(int nombre)
    {
        if(nombre % 2 == 0)
            return "pair";
        else 
            return "impair";
    }

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        boolean test = true;
        int nombre = 0;

        System.out.println("Choisissez un nombre entier compris entre -10 000 et 10 000.");

        while(test)
        {
            nombre = scan.nextInt();

            if(nombre < -10000 || nombre > 10000)
            {
                test = true;
                System.out.println("Rechoisissez un nombre nombre compris entre -10 000 et 10 000.");
            }
            else
                test = false;
        }
        if(nombre != 0)
            System.out.println("le nombre "+ nombre + " est " + positifOuNegatif(nombre) + " et est " + pairOuImpair(nombre) + ".");
        else
            System.out.println("le nombre est "+ nombre + " et il est " + pairOuImpair(nombre) + ".");
    }
}