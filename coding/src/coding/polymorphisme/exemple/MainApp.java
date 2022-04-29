package coding.polymorphisme.exemple;

public class MainApp {

	public static void main(String[] args) {

		Audi a1 = new Audi("A1", "diezel", 5, false);
		Citroen C3 = new Citroen("C3", "Benzin", 6, true);
		Bmw z3 = new Bmw("Z3", "diezel", 6, false);

		/*
		 * Comme nous pouvons le voir nous avons 3 voitures serte une audi, une bmw et
		 * une citroen mais ce sont des voiture. Donc si on le souhaite on peut dire que
		 * nous allons créer 3 voiture qui sont une audi, une bmw et une citroen comme
		 * suite.
		 * 
		 */
		Car a11 = new Audi("A1", "diezel", 5, false);
		Car C31 = new Citroen("C3", "Benzin", 6, true);
		Car z31 = new Bmw("Z3", "diezel", 6, false);
		/*
		 * Et c’est la le polymorphisme on crée un objet car qui est une audi, une bmw
		 * et une citroen. Par contre créer une sous classe dans une autre sous classe
		 * ne fonctionne pas.
		 */
		//Bmw z3 = new Citroen("Z3", "diezel", 6, false);

	}

}
