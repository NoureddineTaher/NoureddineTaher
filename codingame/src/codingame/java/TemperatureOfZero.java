package codingame.java;
import java.util.Arrays;


public class TemperatureOfZero {

	
	
	public static int computeCloseToZero(int[] ts) {

        
        int curr = 0;
        int near = ts[0]; 
        Arrays.sort(ts);      // add this
        System.out.println(Arrays.toString(ts));        
        //find the element nearest to zero
        for ( int i=0; i < ts.length; i++ ){
            System.out.println("dist from " + ts[i] + " = " + Math.abs(0 -ts[i]));
            curr = ts[i] * ts[i]; 
            if ( curr <= (near * near) )  { 
                near = ts[i];
            } 
        }
       
		return near;
		
	}
	
	public static void main(String[] args) {
		
		int[] ts = {2,3,-2, 33, 322};
		System.out.println("temperature closest to zero is : " +computeCloseToZero(ts));
		
	}
}