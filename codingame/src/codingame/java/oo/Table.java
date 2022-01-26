package codingame.java.oo;
public class Table extends Thread {
	
	
	
	@Override
	public void run() {
		int [] numbers = {2,3,5,8,12,66};
		int max =numbers[0];
		for(int i=0; i< numbers.length; i++){
			
		         if(numbers[i] > max ){
		         max = numbers[i];
		          }        
		    }
		System.out.println("le maximum du table est : " + max);
	
	
	  }
	public static void main(String args[]){  
   	 // instanciantion d'un objet de type Thread
   	Table t =  new Table() ;

   	 // lancement de ce thread par appel à sa méthode start()
   	t.start() ;

   	 // cette méthode rend immédiatement la main...
   	System.out.println("Thread lancé") ;
   }
}
