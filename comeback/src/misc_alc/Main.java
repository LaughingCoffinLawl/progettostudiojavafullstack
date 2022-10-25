package misc_alc;

public class Main {

	public static void main(String[] args) {
		
		// Arrays & Loops
		String[] stringArray = {"Chaand","John","Pooja","Mia","Salim"};
		
		for(int i=0;i<=stringArray.length-1;i++){
			System.out.println(stringArray[i]);
		}	
		
		System.out.println("\n");
		
		for(String name: stringArray){
			System.out.println(name);
		}	
		
		
		//callback method
		String[] names = {"Chaand", "John","Steve","Pooja","Rahul"};
		Main main = new Main();
		main.displayNames(names);
		System.out.println("*************");
		System.out.println(names[0]);
	}
	
	
    void displayNames(String[] names){
    	for(String name: names){
    		System.out.println(name);
    	}
	}
}
