package villageGaulois;

import personnage.Gaulois;
import produit.Produit;

public interface IEtal {

	boolean isEtalOccupe();

	Gaulois getVendeur();

	Produit getProduit();

	void occuperEtal(Gaulois vendeur, Produit produit, int quantite);

	boolean contientProduit(String nomProduit);

	int acheterProduit(int quantiteAcheter);

	void libererEtal();

	String[] etatEtal();

}