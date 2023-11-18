package tp5;

public class PropriétéProfessionnelle extends Propriete {
	private int nbEmployes;
	private boolean estEtatique;
	
	PropriétéProfessionnelle(int id,Personne responsable,String adresse,double surface,int nbEmployes,boolean estEtatique){
		super(id,responsable,adresse,surface);
		this.nbEmployes=nbEmployes;
		this.estEtatique=estEtatique;
	}

	@Override
	public String toString() {
		return super.toString()+"  ProprieteProfessionnelle [nbEmployes=" + nbEmployes + ", estEtatique=" + estEtatique + "]";
	}
	@Override double calculImpot() {
		double impot=0;
		if(!estEtatique) {
			impot=surface+ (30/this.nbEmployes) ;
		}
		else {
			impot=0;
		}
		return impot;
	}
	
	

}
