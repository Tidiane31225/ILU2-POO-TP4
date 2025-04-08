package villageGaulois;

import personnage.Gaulois;
import produit.Produit;


public class Etal implements IEtal { 
	private Gaulois vendeur;
    private Produit produit; 
    private int quantiteDebutMarche;
    private int quantite;
    private boolean etalOccupe = false;

    @Override
	public boolean isEtalOccupe() {
        return etalOccupe;
    }

    @Override
	public Gaulois getVendeur() {
        return vendeur;
    }

    @Override
	public Produit getProduit() {
        return produit;
    }

    @Override
	public void occuperEtal(Gaulois vendeur, Produit produit, int quantite) {
        this.vendeur = vendeur;
        this.produit = produit;
        this.quantite = quantite;
        this.quantiteDebutMarche = quantite;
        this.etalOccupe = true;
    }

    @Override
	public boolean contientProduit(String nomProduit) {
        return this.produit.getNom().equals(nomProduit); 
    }

    @Override
	public int acheterProduit(int quantiteAcheter) {
        if (quantite == 0) {
            quantiteAcheter = 0;
        }
        if (quantiteAcheter > quantite) {
            quantiteAcheter = quantite;
        }
        if (etalOccupe) {
            quantite -= quantiteAcheter;
        }
        return quantiteAcheter;
    }

    @Override
	public void libererEtal() {
        etalOccupe = false;
    }

    @Override
	public String[] etatEtal() {
        String[] donneesVente = new String[5];
        donneesVente[0] = String.valueOf(etalOccupe);
        if (etalOccupe) {
            donneesVente[1] = vendeur.getNom();
            donneesVente[2] = produit.getNom(); 
            donneesVente[3] = String.valueOf(quantiteDebutMarche);
            donneesVente[4] = String.valueOf(quantiteDebutMarche - quantite);
        }
        return donneesVente;
    }
}
