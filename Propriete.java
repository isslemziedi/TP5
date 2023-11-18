package tp5;

import java.util.Objects;

abstract public class Propriete {
	protected int id;
	protected Personne responsable;
	protected String adresse;
	protected double surface ;
	
	Propriete(int id,Personne responsable,String adresse,double surface){
		this.id=id;
		this.responsable=responsable;
		this.adresse=adresse;
		this.surface=surface;
	}

	@Override public String toString() {
		return "Propriete [id=" + id + ", responsable=" + responsable +",  adresse :'"+adresse+"' , surface=" + surface + "]";
	}

	abstract double calculImpot();


	@Override public boolean equals(Object obj) {
		if ((obj == null)||(getClass() != obj.getClass())) {
			return false;
		}
		Propriete other = (Propriete) obj;
		return this.id == other.id;
	}
	
	
}
