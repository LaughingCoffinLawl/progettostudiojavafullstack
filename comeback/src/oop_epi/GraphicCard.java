package oop_epi;

public class GraphicCard {
	protected String frequency;
	protected String brand;
	protected String vram;
	
	public GraphicCard() {
		this.frequency = "6000MHz";
		this.brand = "Nvidia";
		this.vram = "DDR6";
	}
	
	public String showInfo() {
		return ("Brand: " + brand + "| vram: " + vram +
				" | Frequenza: " + frequency);	
	}
}
