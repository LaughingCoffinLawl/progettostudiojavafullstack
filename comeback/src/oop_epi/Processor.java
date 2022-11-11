package oop_epi;

public class Processor implements Interfaccia {

	@Override
	public String brand() {
		return "Intel";
	}

	@Override
	public int core() {
		return 6;
	}

	@Override
	public String frequency() {
		return "4500 MHz";
	}
	

	public String showInfo() {
		return ("Brand: " + brand() + "| Cores: " + core() +
				" | Frequenza: " + frequency());	
	}
}
