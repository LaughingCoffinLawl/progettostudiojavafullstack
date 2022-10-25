package misc_arsbx;

import java.util.ArrayList;

class intWrapper {
	
	public int intValue;
	
	public intWrapper(int intValue) {
		this.intValue = intValue;
	}
	
	public int getIntvalue() {
		return intValue;
	}

	public void setIntvalue(int intValue) {
		this.intValue = intValue;
	}	
}

public class Box {

	public static void main(String[] args) {
		
		ArrayList<Integer> studentNumbers = new ArrayList<>();
		studentNumbers.add(25); //Autoboxing
		System.out.println(studentNumbers.get(0)); //Unboxing  
		
		//--------------------------------------------------------------------------------
		
		ArrayList<intWrapper> studentNumbers2 = new ArrayList<>();
		studentNumbers2.add(new intWrapper(2)); //Boxing
		System.out.println(studentNumbers2.get(0).getIntvalue()); //Unboxing
		
		//--------------------------------------------------------------------------------
		
		ArrayList<Double> demoList = new ArrayList<>();
		demoList.add(25.5);
		//demoList.add(new Double(25.2));
		demoList.add(Double.valueOf(10.0)); //This is done while autoboxing
		//System.out.println(demoList.get(0));
		System.out.println(demoList.get(0).doubleValue()); //This is done while unboxing
		
		//---------------------------------------------------------------------------------
		
		ArrayList<Integer> demoListInteger = new ArrayList<>();
		demoListInteger.add(10);
		System.out.println(demoListInteger.get(0));
		
		ArrayList<Float> demoListFloat = new ArrayList<>();
		demoListFloat.add(12.0f);
		System.out.println(demoListFloat.get(0));
	}
}
