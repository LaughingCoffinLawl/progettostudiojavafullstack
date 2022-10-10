package oop_aia;

public class Main {

	public static void main(String[] args) {
		Person Jhon = new Vegan();
		Jhon.eat();
		Jhon.speak();
		
		System.out.println("***************");
		
		Person Mia = new Nonvegan();
		Mia.eat();
		Mia.speak();
	}
}
