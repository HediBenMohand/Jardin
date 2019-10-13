package Flore;

public abstract class Vegetal {
	protected Etat etat;
	protected String dessin[] = new String[6];
	
	public Vegetal() {
		dessin[0] = " _ ";
		dessin[1] = " . ";
		dessin[2] = " | ";
		dessin[5] = " Mort ";
		
	}

}
