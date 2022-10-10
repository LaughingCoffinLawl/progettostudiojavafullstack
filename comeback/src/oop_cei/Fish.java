package oop_cei;

public class Fish extends Animal{
	protected String water;
	protected boolean gills;
	
	public Fish() {
		height = 100;
		weight = 50;
		animalType = "Fish";
		bloodType = "D";
		this.water = "Salted";
		this.gills = true;
	}
	
	public String showInfo() {
		return ("Altezza: " + height + "| Peso: " + weight 
				+ " | Animale: " + animalType + " | Gruppo Sanguigno: " 
				+ bloodType + " | Water: " + water + " | Gills: " 
				+ gills);		
	}
}
