package tp5;

public interface GestionPropriet {
	public static final int MAX_PROPRIETES=15;
	
	public void afficherPropriétés();
	public boolean ajouter(Propriete p);
	public boolean supprimer(Propriete p);
}
