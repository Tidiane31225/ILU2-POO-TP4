package produit;

import personnage.Gaulois;

public abstract class Produit {
	private String nom;
	private Unite unite;
	
	public Produit(String nom,Unite unite) {
		this.nom=nom;
		this.unite=unite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Unite getUnite() {
		return unite;
	}
	
	public abstract String decrireProduit();
		
	
	
	public enum Unite{
		GRAMME("g"),
	    KILOGRAMME("kg"),
	    LITRE("l"),
	    CENTILITRE("cl"),
	    MILLILITRE("ml"),
	    PIECE("pièce");
		 private final String abbreviation;

		    Unite(String abbreviation) {
		        this.abbreviation = abbreviation;
		    }

		    @Override
		    public String toString() {
		        return abbreviation;
		    }

	}
	
	public static class Poisson extends Produit {
	    private String datePeche;

	    public Poisson(String datePeche) {
	        super("poisson", Unite.PIECE); 
	        this.datePeche = datePeche;
	    }

	    @Override
	    public String decrireProduit() {
	        return "poisson pêchés " + datePeche + ".";
	    }
	}
	
	public static class Sanglier extends Produit {
	    private int poids; 
	    private Gaulois chasseur;

	    public Sanglier(int poids, Gaulois chasseur) {
	        super("sanglier", Unite.KILOGRAMME); 
	        this.poids = poids;
	        this.chasseur = chasseur;
	    }

	    @Override
	    public String decrireProduit() {
	        return "sanglier de " + poids + " " + getUnite() + " chassé par " + chasseur.getNom() + ".";
	    }
	}
}
