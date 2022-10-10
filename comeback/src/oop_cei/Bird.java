package oop_cei;

public class Bird extends Animal {
	protected Boolean feathers;
	protected Boolean canFly;
	
	public Bird() {
		height = 100;
		weight = 50;
		animalType = "Bird";
		bloodType = "B";
		this.feathers = true;
		this.canFly = true;
	}
	
	public String showInfo() {
		return ("Altezza: " + height + "| Peso: " + weight 
				+ " | Animale: " + animalType + " | Gruppo Sanguigno: " 
				+ bloodType + " | Feathers: " + feathers + " | Ability to fly: " 
				+ canFly);	
	}
}
