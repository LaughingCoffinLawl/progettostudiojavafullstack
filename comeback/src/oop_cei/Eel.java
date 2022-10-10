package oop_cei;

public class Eel extends Fish{
	private String ability;
	
	public Eel() {
		animalType = "Fish";
		this.water = "Salted";
		this.gills = true;
		this.ability = "Produce electricity";
	}
	
	public String showInfo() {
		return ("Altezza: " + height + "| Peso: " + weight 
				+ " | Animale: " + animalType + " | Gruppo Sanguigno: " 
				+ bloodType + " | Water: " + water + " | Gills: " 
				+ gills + " | Ability: " + ability);		
	}
}
