/* création d'une classe lumière */

public class Light{
    public boolean lumiere;
    public int intensite;

    Light(){
        lumiere = false;
        intensite = 0;
    }

    public void on(){ //allume la lumière
        if(lumiere == false){
            lumiere = true;
            intensite = 1;
            System.out.println("La lumière a été allumée.");
        }
        else
            System.out.println("La lumière est déjà allumée.");
    }

    public void off(){ //éteint la lumière
        if(lumiere == true){
            lumiere = false;
            intensite = 0;
            System.out.println("La lumière a été éteinte.");
        }
        else
            System.out.println("La lumière est déjà éteinte.");
        
    }

    public void brighten(){
        if( lumiere == true ){
            if(intensite < 3 ){
                intensite++;
                System.out.println("l'intensité est plus élevé.");
            }
            else
                System.out.println("Impossible de plus augmenter l'intensité");
        }
        else
            System.out.println("Impossible car la lumière est éteinte.");
    }

    public void dim(){
        if( lumiere == true ){
            if(intensite > 1){
                intensite--;
                System.out.println("l'intensité est plus faible.");
            }
            else
                System.out.println("Impossible de plus diminuer l'intensité");
        }
        else
            System.out.println("Impossible car la lumière est éteinte.");

    }

    public static void main(String []args){
        Light la = new Light();
        la.on();
        la.brighten();
        la.brighten();
        la.dim();
        la.off();

        la.brighten();

    }
}