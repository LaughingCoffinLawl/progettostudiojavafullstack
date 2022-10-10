package oop_cei;

public class Reptile extends Animal{
	protected String skin;
	protected boolean backbone;
	protected String egg;
	
	public Reptile() {
		height = 100;
		weight = 50;
		animalType = "Retile";
		bloodType = "C";
		this.skin = "Dry skin";
		this.backbone = true;
		this.egg = "Soft-shelled eggs";
	}
	
	public String showInfo() {
		return ("Altezza: " + height + "| Peso: " + weight 
				+ " | Animale: " + animalType + " | Gruppo Sanguigno: " 
				+ bloodType + " | Skin: " + skin + " | Backbone: " 
				+ backbone + " | Eggs: " + egg);	
	}
}
