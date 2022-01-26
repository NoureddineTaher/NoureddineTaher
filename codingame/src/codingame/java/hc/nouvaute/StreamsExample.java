package codingame.java.hc.nouvaute;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {
		
		
		List<String> strings = Arrays.asList("girafe", "chameau", "chat", "poisson", "cachalot");

	       strings.stream()
	               // filtrage

	               .filter(x -> x.contains("cha"))
	               // mapping : reformatage des cha�nes de caract�res

	               .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
	               // tri par ordre alphab�tique

	               .sorted()
	               // Outputs:

	               // Cachalot

	               // Chameau

	               // Chat

	               .forEach( System.out::println );

	}

}
