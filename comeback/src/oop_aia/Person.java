package oop_aia;

public abstract class Person implements Living, isAlive{
	public void speak() {
		System.out.println("stringa"); //IS-CAN relationship
	}
	
	@Override 
	public void breathe() {
		System.out.println("Testo 1");
	}
	
	@Override
	public void message() {
		System.out.println("Testo 2");
	}
	
	public abstract void eat(); //IS-A relationship
}
