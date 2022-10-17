package ui_try;

public class Try {

	public static void main(String[] args) {
		int x = 0;
		try{
		
		    System.out.println("We don't know, what will be the outcome "+x/0);
		
		}catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurred");
		}
		catch (RuntimeException e) {
			System.out.println("Inside exception block");
		}
	}
}
