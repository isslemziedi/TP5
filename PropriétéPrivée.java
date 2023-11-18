package tp5;

public class PropriétéPrivée extends Propriete{
	protected int nbPieces;
	
	PropriétéPrivée(int id,Personne responsable,String adresse,double surface,int nbPieces){
		super(id,responsable,adresse,surface);
		this.nbPieces=nbPieces;
	}
	
	@Override
	public String toString() {
		return super.toString()+"  ProprietePrivee [nbPieces=" + nbPieces + "]";
	}

	@Override double calculImpot() {
		double impot=0;
		impot=0.5 * surface + 10/this.nbPieces;
		return impot;
	}
	
}
