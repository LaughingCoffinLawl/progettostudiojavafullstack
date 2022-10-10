package oop_cei;

public class Animal {
	protected float height;
	protected float weight;
	protected String animalType;
	protected String bloodType;
	
	public Animal () {
		this.height = 0;
		this.weight = 0;
		this.animalType = "unknown";
		this.bloodType = "unknown";
	}
	
	public String showInfo() {
		return ("Altezza: " + height + "| Peso: " + weight +
				" | Animale: " + animalType + " | Gruppo Sanguigno: " 
				+ bloodType);	
	}
}
