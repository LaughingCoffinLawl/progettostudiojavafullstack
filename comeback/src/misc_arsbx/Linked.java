package misc_arsbx;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		new Linked().printList(countries);
		countries.add(1, "Canada");
		countries.add("Bragil");
		new Linked().printList(countries);
	    countries.set(7, "Brazil");
	    new Linked().printList(countries);
	    countries.remove(4);
	    new Linked().printList(countries);
	    
	    Linked app = new Linked();
		app.printList2(countries);
		System.out.println("*************");
		countries.sort(null);
		app.printList2(countries);
		System.out.println("*************");
		Collections.reverse(countries);
		app.printList(countries);
		
	}
	void printList(LinkedList<String> list){
		for(String element: list){
			System.out.println("Element: "+element);
		}
		System.out.println("*****************************");
	}	
	
	void printList2(List<String> list){
		for(String element: list){
			System.out.println("Element: "+element);
		}
		System.out.println("*****************************");
	}
	
	void printList3(List<String> list){
    	ListIterator<String> iterator = list.listIterator();
    	 while(iterator.hasNext()){
    		 System.out.println("Element: "+iterator.next());
    	 }
     }
}
