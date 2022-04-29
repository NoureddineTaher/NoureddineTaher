package coding.polymorphisme.exemple;




/*
 Le polymorphisme dans java veut simplement dire qu’une classe peut prendre
  plusieurs formes et c’est d’autant plus vrai avec les classes qui hérite 
  d’une classe supérieure.
  
 Nous allons reprendre l’exemple d’une voiture. Et donc si on créer un classe 
 voiture on peut lui donner un modèle, type de carburant, 
 le nombre de vitesse, et si c’est une automatique ou une manuelle.
 */

public class Car {
	
	private String model;
	private String fuel;
	private int nbreGear;
	private boolean auto;
	
	public Car(String model, String fuel, int nbreGear, boolean auto) {
		super();
		this.model = model;
		this.fuel = fuel;
		this.nbreGear = nbreGear;
		this.auto = auto;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getNbreGear() {
		return nbreGear;
	}

	public void setNbreGear(int nbreGear) {
		this.nbreGear = nbreGear;
	}

	public boolean isAuto() {
		return auto;
	}

	public void setAuto(boolean auto) {
		this.auto = auto;
	}
	

}
