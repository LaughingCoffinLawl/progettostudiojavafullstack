package oop_cei;

import java.util.ArrayList;
import java.util.List;

import oop_epi.Laptop;

public class Main {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<>();
		Animal myReptile = new Reptile();
		Animal myFish = new Fish();
		Animal myBird = new Bird();
		Animal myCrocodile = new Crocodile();
		Animal myEel = new Eel();
		Animal myEagle = new Eagle();
		Laptop myLaptop = new Laptop();
		
		animals.add(myReptile);
		animals.add(myFish);
		animals.add(myBird);
		animals.add(myCrocodile);
		animals.add(myEel);
		animals.add(myEagle);
		
		AnimalList(animals);
		
		System.out.println(myLaptop.showInfo());
	}
	
	public static void AnimalList (List<Animal> animals) {
		for (Animal animal: animals) {
			System.out.println(animal.showInfo());
		}
	}
}
