package oop_cei;

public class Eagle extends Bird{
	public Eagle() {
		animalType = "Bird";
	}
	
	public String showInfo() {
		return ("Altezza: " + height + "| Peso: " + weight 
				+ " | Animale: " + animalType + " | Gruppo Sanguigno: " 
				+ bloodType + " | Feathers: " + feathers + " | Ability to fly: " 
				+ canFly);	
	}
}
