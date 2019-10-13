import java.util.HashMap;

public class Jardin {
	
	private int largeur;
	private int longueur;
	private Emplacement emplacement[][];
	private HashMap<String,Integer> panier;
	
	public Jardin(int longueur,int largeur){
	
		this.longueur=longueur;
		this.largeur=largeur;
		this.panier=new HashMap<String, Integer>();	
		this.panier.put("Ail", 4);
		this.panier.put("Betterave",7);
		this.panier.put("carotte", 2);
		
		
		this.emplacement= new Emplacement[longueur][largeur];
	}
			

}
