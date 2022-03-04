package week3;

public class CodingAssignment {

	public static void main(String[] args) {
		// Create an array of int called ages that contains the following values:
		// 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 45 };

		// Programmatically subtract the value of the first element in the array from
		// the value in the last element of the array (i.e. do not use ages[7] in your
		// code). Print the result to the console.
		System.out.println(ages[(ages.length - 1)] - ages[0]); // Add a new age (45) to your array and repeat the step
																// above
																// to ensure it is dynamic (works for arrays of
																// different lengths).

		// Use a loop to iterate through the array and calculate the average age. Print
		// the result to the console.
		int ageSum = 0;
		for (int age : ages) {
			ageSum += age;
		}
		System.out.println(ageSum / ages.length);

		// Create an array of String called names that contains the following values:
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// Use a loop to iterate through the array and calculate the average number of
		// letters per name. Print the result to the console.
		double sum = 0;
		for (String name : names) {
			sum += name.length();
		}
		System.out.println(sum / names.length);

		// Use a loop to iterate through the array again and concatenate all the names
		// together, separated by spaces, and print the result to the console.
		String concatNames = "";
		for (String name : names) {
			concatNames += name + " ";
		}
		System.out.println(concatNames);

		// How do you access the last element of any array?
		// array[array.length -1]
		// How do you access the first element of any array?
		// array[0]

		// Create a new array of int called nameLengths. Write a loop to iterate over
		// the previously created names array and add the length of each name to the
		// nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}

		// Write a loop to iterate over the nameLengths array and calculate the sum of
		// all the elements in the array. Print the result to the console.
		int nameLengthSum = 0;
		for (int length : nameLengths) {
			nameLengthSum += length;
		}
		System.out.println(nameLengthSum);
		
		//Test Methods:
		testMethods();

	}
	// Write a method that takes a String, word, and an int, n, as arguments and
	// returns the word concatenated to itself n number of times. (i.e. if I pass in
	// “Hello” and 3, I would expect the method to return “HelloHelloHello”).

	private static String concatSelf(String word, int n) {
		String concatString = "";
		if (n > 0) {
			while (n > 0) {
				concatString += word;
				n--;
			}
		}
		return concatString;
	}

	// Write a method that takes two Strings, firstName and lastName, and returns a
	// full name (the full name should be the first and the last name as a String
	// separated by a space).
	private static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}

	// Write a method that takes an array of int and returns true if the sum of all
	// the ints in the array is greater than 100.
	private static boolean isOver100(int[] array) {
		int sum = 0;
		for (int number : array) {
			sum += number;
		}
		return sum > 100;
	}

	// Write a method that takes an array of double and returns the average of all
	// the elements in the array.
	private static double findAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}

	// Write a method that takes two arrays of double and returns true if the
	// average of the elements in the first array is greater than the average of the
	// elements in the second array.
	private static boolean isGreaterThan(double[] arr1, double[] arr2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double number : arr1) {
			sum1 += number;
		}
		for (double number : arr2) {
			sum2 += number;
		}
		return sum1 / arr1.length > sum2 / arr2.length;
	}

	// Write a method called willBuyDrink that takes a boolean isHotOutside, and a
	// double moneyInPocket, and returns true if it is hot outside and if
	// moneyInPocket is greater than 10.50.
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}

	// Create a method of your own that solves a problem. In comments, write what
	// the method does and why you created it.
	
	//This method is a test of all preceding methods:
	private static void testMethods() {
		int[] testIntArray1 = {20, 15, 68, 82, 46};
		int[] testIntArray2 = {2, 5, 8, 12, 3}; 
		double[] testDblArr1 = {42.35, 53.89, 35.20, 16.5};
		double[] testDblArr2 = {4.5, 5.89, 3.20, 1.5};
		double[] testDblArr3 = {14.2, 63.36, 38, 160.5};
		
		System.out.println("Concatenation (Hello 3x): " + concatSelf("Hello", 3));
		System.out.println("Full Name: " + createFullName("John", "Smith"));
		System.out.println("Over 100 (true): " + isOver100(testIntArray1));
		System.out.println("Over 100 (false): " + isOver100(testIntArray2));
		System.out.println("Double Array Average: " + findAverage(testDblArr1));
		System.out.println("First Avg Greater (true): " + isGreaterThan(testDblArr1, testDblArr2));
		System.out.println("First Avg Greater (false): " + isGreaterThan(testDblArr2, testDblArr3));
		System.out.println("I will buy a drink (true): " + willBuyDrink(true, 25.00));
		System.out.println("I will buy a drink (false, not hot): " + willBuyDrink(false, 25.00));
		System.out.println("I will buy a drink (false, broke): " + willBuyDrink(true, 5.00));
		
	
	}

}
