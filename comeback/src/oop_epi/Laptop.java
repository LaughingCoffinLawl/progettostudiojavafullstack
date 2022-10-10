package oop_epi;

public class Laptop {
	protected String ram;
	protected Processor processor;
	protected GraphicCard graphicCard;
	protected String psu;
	protected int fan;
	
	public Laptop() {
		this.ram = "DDR4";
		this.processor = new Processor();
		this.graphicCard = new GraphicCard();
		this.psu = "450W";
		this.fan = 4;
	}
	
	public String showInfo() {
		return ("RAM: " + ram + "| CPU: [" + processor.showInfo() +
				"] | GPU: [" + graphicCard.showInfo() + "] | PSU: " 
				+ psu);	
	}
}
