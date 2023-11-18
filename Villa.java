package tp5;

public class Villa extends PropriétéPrivée{
	private boolean avecPiscine;
	
	Villa(int id,Personne responsable,String adresse,double surface,int nbPieces,boolean avecPiscine){
		super(id,responsable,adresse,surface,nbPieces);
		this.avecPiscine=avecPiscine;
	}

	@Override
	public String toString() {
		return super.toString()+"Villa [avecPiscine=" + avecPiscine + "]";
	}
	
	@Override double calculImpot() {
		double impot=0;
		if(avecPiscine==true) {
			impot=super.calculImpot()+200;
		}
		else {
			impot=super.calculImpot();
		}
		return impot;
	}

	
}
