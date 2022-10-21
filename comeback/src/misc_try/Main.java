package misc_try;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		System.out.println("What's your age?");
		Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age is "+age);
        sc.close();
	}
}
