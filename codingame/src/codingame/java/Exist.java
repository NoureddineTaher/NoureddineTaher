package codingame.java;

import java.util.Arrays;

public class Exist {
	
	

    static boolean exists(int[] ints, int k) {
        for (int i : ints)
            if (i == k) return true;
        return false;
    }

}
