package tp5;

public class Fiscalite {

	private static PropriétéPrivée[] tabProp;

	public static void main(String[] args) {
		Personne p1 = new Personne(4000,"ben salah","ali");
		Personne p2 = new Personne(4000,"ziedi","isslem");
		Personne p3 = new Personne(4000,"skouri","eya");
		
		Lotissement l = new Lotissement(10);
		
		PropriétéPrivée pv1 = new PropriétéPrivée(1,p1,"Corniche",350,4);
		Villa v1=new Villa(2,p2,"Dar Chaabane", 400,6,true);
		Appartement a1 = new Appartement(3,p2,"Hammamet",1200,8, 3);
		PropriétéProfessionnelle pf1 = new PropriétéProfessionnelle(4,p3,"Korba", 1000, 50,true);
		PropriétéProfessionnelle pf2 = new PropriétéProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false);
		
		l.ajouter(pv1);
		l.ajouter(v1);
		l.ajouter(a1);
		l.ajouter(pf1);
		l.ajouter(pf2);
		
		l.afficherPropriétés();
		
		System.out.println("Le nombre global des pieces = "+l.getnbPièces()+"\n");
		
		l.MinImpot();
		
		l.supprimer(a1);
		l.afficherPropriétés();
		
		//LotissementPrivée
		Lotissement lt= new LotissementPrivée(10);
		lt.ajouter(pv1);
		System.out.println(lt.getpropriétéByIndice(0));
		System.out.println("Le nombre global des pieces = "+lt.getnbPièces()+"\n");
		
		
	}

}
