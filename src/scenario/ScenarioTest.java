package scenario;
import personnage.Gaulois;
import produit.Produit;
import produit.Produit.Poisson;
import produit.Produit.Sanglier;
import villageGaulois.Etal;
import villageGaulois.IEtal;

public class ScenarioTest {
    public static void main(String[] args) {
       
        IEtal[] marche = new IEtal[3]; 
        Etal etalSanglier1 = new Etal();
        Etal etalPoisson1 = new Etal();

        
        marche[0] = etalSanglier1;
        marche[1] = etalPoisson1;

        
        Gaulois obelix = new Gaulois("Obélix",8);
        Sanglier sanglier = new Sanglier(15, obelix);

        Gaulois panoramix = new Gaulois("Panoramix",5);
        Poisson poisson = new Poisson("mardi");

        etalSanglier1.occuperEtal(obelix, sanglier, 3);
        etalPoisson1.occuperEtal(panoramix, poisson, 10);

       
        for (IEtal etal : marche) {
            if (etal != null) {
                System.out.println("État de l'étal :");
                for (String info : etal.etatEtal()) {
                    System.out.println(info);
                }
            }
        }
    }
}

