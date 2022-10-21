package misc_tte;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		System.out.println("What's your age?");
		Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
        sc.close();
        
        //Enumerator
        Learning learn = Learning.MULTITHREADING;
        switch (learn) {
        case COREJAVA:
        	System.out.println("1");
        	break;
        case COLLECTIONS:
        	System.out.println("2");
        	break;
        case GENERICS:
        	System.out.println("3");
        	break;
        case JSPANDSERVLET:
        	System.out.println("4");
        	break;
        case MULTITHREADING:
        	System.out.println("5");
        	break;
        default:
        	break;
        }
	}
 
}
