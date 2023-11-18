package tp5;

import java.util.Objects;

class Lotissement implements GestionPropriet {
	protected Propriete [] tabProp;
	protected int nombre;
	
	Lotissement(int capacite) {
		if(MAX_PROPRIETES>capacite) {
			tabProp = new Propriete[capacite];
		}
	}
	
	Propriete getpropriétéByIndice(int k) {
		if (k >= 0 && k < tabProp.length) {
	        return tabProp[k];
	    } else {
	        return null;
	    }
	}
	
	
	int getnbPièces()
	{
		int nbr=0 ;
			for(int i =0;i<tabProp.length;i++) {
			if(tabProp[i] instanceof PropriétéPrivée) {
				nbr+=((PropriétéPrivée)tabProp[i]).nbPieces;
			}
		}
		return nbr;
	}	
	
	void MinImpot() {
		Propriete min=tabProp[0];
		for(int i=0;i<tabProp.length;i++) {
			if(tabProp[i] instanceof PropriétéPrivée) {
				if(tabProp[i].calculImpot() < min.calculImpot()) {
					min=((PropriétéPrivée)tabProp[i]);
				} 
			}
		}
		System.out.println(" le proprietaire de la propriete privee qui paye le moins d impots est : '"+min.responsable+"d impots = "+min.calculImpot()+"\n");
	}

	
	@Override public void afficherPropriétés() {
		for(int i =0;i<nombre;i++) {
			System.out.println(tabProp[i].toString()+" , la valeur d'impots a payer = "+tabProp[i].calculImpot()+"\n");
		}
	}

	@Override public boolean ajouter(Propriete p) {
		
		if(nombre<tabProp.length) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean supprimer(Propriete p) {
		int i =0;
		while(i<nombre && tabProp[i].equals(p)== false) {
			i++;}
			if(i<nombre) {
				for(int j=i;j<nombre-1;j++) {
					tabProp[j]= tabProp[j+1];
				}
					nombre--;
					return true;
			}
		return false;
		
	}
}
