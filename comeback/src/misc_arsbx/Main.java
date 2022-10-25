package misc_arsbx;

import java.util.ArrayList;

public class Main {
	 static ArrayList<String> listNames = new ArrayList<>();
		
		public static void main(String[] args) {
			listNames.add("Chaand");
			listNames.add("John");
			listNames.add("Steve");
			listNames.add("Pooja");
			listNames.add("Salim");
			listNames.add("Rahul");
			listNames.add("Mia");
			listNames.add("Angel");
			Main main = new Main();
			main.displayList(listNames);
		   /*	app.removeNameByPosition(0);
			System.out.println("************");
			app.displayList(listNames);
			System.out.println("************");
			System.out.println(listNames.get(0));
			System.out.println(listNames.get(1)); */
			
			System.out.println("************");
			main.removeNameByString("Pooja");
			main.displayList(listNames);
			System.out.println("************");
			System.out.println(listNames.get(3));
			
			int position = main.search("Mia");
		       if(position != -1){
		    	   main.modifyName(position, "Emma");
		    	   main.displayList(listNames);	
		       } else {
		    	   System.out.println("Invalid entry");
		       }
		}
		
		
		void displayList(ArrayList<String> names){
			for(String name: names){
				System.out.println(name);
			}	
		}
		
		void removeNameByPosition(int position){
		   listNames.remove(position);
		}
		
		void removeNameByString(String name){
			listNames.remove(name);
		}
		
		void modifyName(int position, String newName){
			listNames.set(position, newName);
		}
		
		int search(String name){
			return listNames.indexOf(name);
		}
}
