package coding.designPattern.exemples;

public class Etudiant {
	
	public String nom;
	public String prenom;
	public int nbAnne;


	public static String getEtudiant(int nbAnne  ) {
	
		if(nbAnne >= 3) 
			
			//System.out.println("l'etudiant liscencié");
			return "l'etudiant liscencié";
		
		
		else if (3 < nbAnne && nbAnne <= 5)
			
			//System.out.println("l'etudiant mastere");
			return "l'etudiant mastere";
		
		
		else 
		return "ttt";
		
	}
	
	
	
	public static void main(String[] args) {
		
        System.out.println("le res est: " + getEtudiant(4) );
		
		
		
	}

}
