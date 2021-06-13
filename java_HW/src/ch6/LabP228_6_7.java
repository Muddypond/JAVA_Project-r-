package ch6;

public class LabP228_6_7 {
	public static void main(String[] args) {
		int[] ints = createArray();
		System.out.println("The integers are:");
		displayArray(ints);
		int[] counts = countDigits(ints);
		System.out.println();
		System.out.println("The occurrences of each digit are:");
		displayCounts(counts);
	}
	/** Create an array of characters */
	public static int[] createArray(){
		// Declare an array of characters and create it
		int[] ints = new int[100];
		for (int i = 0; i < ints.length; i++) 
			ints[i] = (int)(Math.random()* 10);
		// Return the array
		return ints;
	}

	/** Display the array of characters */
	public static void displayArray(int[] ints){
		// Display the characters in the array 20 on each line
		for (int i = 0; i < ints.length; i++) {
			if ((i + 1) % 20 == 0)
				System.out.println(ints[i]);
			else
				System.out.print(ints[i] + " ");
		}
	}

	/** Count the occurrences of each letter */
	public static int[] countDigits(int [] ints){
		int[] counts = new int[10];
		for (int i = 0; i < ints.length; i++) 
			counts[ints[i]]++;
		return counts;
	}

	/** Display counts */
	public static void displayCounts(int[] counts){
		System.out.print("digits:\n");
		for (int i = 0; i < counts.length; i++) 
			System.out.print("["+i+"]"+"\t");
		System.out.print("\n");
		System.out.print("occurances:\n");
		for (int i = 0; i < counts.length; i++) 
			System.out.print(counts[i]+"\t");
		return;
	}

}
