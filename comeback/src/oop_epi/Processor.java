package oop_epi;

public class Processor implements Interfaccia {

	@Override
	public String brand() {
		// TODO Auto-generated method stub
		return "Intel";
	}

	@Override
	public int core() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public String frequency() {
		// TODO Auto-generated method stub
		return "4500 MHz";
	}
	

	public String showInfo() {
		return ("Brand: " + brand() + "| Cores: " + core() +
				" | Frequenza: " + frequency());	
	}
}
