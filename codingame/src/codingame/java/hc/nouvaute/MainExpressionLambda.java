package codingame.java.hc.nouvaute;

public class MainExpressionLambda {
	
	private static int calculer(int x, int y, InterfaceExpressionLambda op) {
	      return op.calc(x, y);
	   }
	
	public static void main(String[] args) {
	//avec la déclaration de type
	InterfaceExpressionLambda addition = (int x, int y) -> x + y;
  
    //sans déclaration de type
	InterfaceExpressionLambda soustraction = (x, y) -> x - y;
  
    //avec 'return' et les accolades
	InterfaceExpressionLambda multiplication = (int x, int y) -> { return x * y; };
  
    //sans 'return' et sans les accolades
	InterfaceExpressionLambda division = (int x, int y) -> {return x / y;};
  
		   System.out.println("8 + 2 = " + calculer(8, 2, addition));
		    System.out.println("8 - 2 = " + calculer(8, 2, soustraction));
		    System.out.println("8 x 2 = " + calculer(8, 2, multiplication));
		    System.out.println("8 / 2 = " + calculer(8, 2, division));
	}
	

}
