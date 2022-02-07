package examples;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] intArrOne = new int[5];		// Brackets-after-type is the most common form
		int intArrTwo[] = new int[3];		// ...but you can put brackets after the name too
		
		int[] intArrThree = {5, 10, 15};	// This creates an array of size 3, with values in every index
		
		intArrOne[0] = 1;
		intArrOne[1] = 1;
		intArrOne[2] = 2;
		intArrOne[3] = 3;
		intArrOne[4] = 5;
		
		System.out.println("intArrThree[1] = " + intArrThree[1]);
		
		
	}
}
