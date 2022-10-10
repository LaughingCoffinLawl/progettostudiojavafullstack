package oop_cei;

public class Crocodile extends Reptile{
	private String egg;
	
	public Crocodile() {
		animalType = "Reptile";
		this.skin = "Dry skin";
		this.backbone = true;
		this.egg = "Hard-shelled egg";
	}
	
	public String showInfo() {
		return ("Altezza: " + height + "| Peso: " + weight 
				+ " | Animale: " + animalType + " | Gruppo Sanguigno: " 
				+ bloodType + " | Skin: " + skin + " | Backbone: " 
				+ backbone + " | Eggs: " + egg);	
	}
}
