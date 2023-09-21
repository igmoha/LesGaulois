package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		
		this.nom = nom;
		this.force = force;
	}
	public String getnom() {
		return nom;
		
	}
	
	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force = force;
	}
	public int getEffetpotion() {
		return effetPotion;
	}
	
	
	public void parler(String texte) {
		System.out.println( prendreParole() + "<<" + texte + ">>");
		
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : " ;
		
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3);
		}
		
		public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		}
		public static void main(String[] args) {
			Gaulois asterix = new Gaulois("Asterix" , 8);
			System.out.println(asterix);
			asterix.parler("Bonjour � tous");
			asterix.prendreParole();
			
		
		}

}



