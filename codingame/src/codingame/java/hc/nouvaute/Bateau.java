package codingame.java.hc.nouvaute;

public class Bateau extends Thread  {
	
    // surcharge de la m�thode run() de la classe Thread
    public  void run() {
      
       int n =  0 ; 
       while (n++ <  10) {
         System.out.println("Je vogue !") ;
          try {
      
            Thread.sleep(10) ;
         }  catch (InterruptedException e) {
         
             // gestion de l'erreur
         }
      }
   }
    public static void main(String args[]){  
    	 // instanciantion d'un objet de type Thread
    	Bateau b =  new Bateau() ;

    	 // lancement de ce thread par appel � sa m�thode start()
    	b.start() ;

    	 // cette m�thode rend imm�diatement la main...
    	System.out.println("Thread lanc�") ;
    }
}
