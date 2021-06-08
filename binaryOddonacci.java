
//Done by: Houssen Kassir 40015126
//For Course : comp 352
//Assignment #1
//------------------------------------------------------------------------------------------------------------------
import java.io.*;

public class binaryOddonacci {
	private static int numberOfCalls = 0;
	private static int currentStackSize = 0;
	private static int maxReachedStackSize = 0;
	private static PrintWriter out;

	public static void main(String[] args) throws FileNotFoundException {

		// System.out.println("Here is the Oddonacci(" + n + ") sequence\n");
		out = new PrintWriter(new FileOutputStream("Binary_Oddonacci_output.txt"));
		out.println("//Done by: Houssen Kassir 40015126\r\n" + "//For Course : comp 352\r\n" + "//Assignment #1\r\n"
				+ "//------------------------------------------------------------------------------------------------------------------");
		out.println(" ");
		for (int i = 5; i <= 100; i = i + 5) {
			Long start = System.currentTimeMillis();
			int OddonacciValue = binaryOddonaccif(i);
			Long end = System.currentTimeMillis();
			out.println("\n The Oddonacci value for n=" + i + " is:" + OddonacciValue + ".");
			System.out.println("\n The Oddonacci value for n=" + i + " is:" + OddonacciValue + ".");
			out.println("\n\nThe method has been called " + numberOfCalls + " times.");
			System.out.println("\n\nThe method has been called " + numberOfCalls + " times.");
			out.println(
					"\n\nThe maximum recorded value of stack growth for n=" + i + " was: " + maxReachedStackSize + ".");
			System.out.println(
					"\n\nThe maximum recorded value of stack growth for n=" + i + " was: " + maxReachedStackSize + ".");
			out.println(" ");
			System.out.println(" ");
			out.println("Execution time is (" + (end - start) + ") ms.");
			System.out.println("Execution time is (" + (end - start) + ") ms.");

		}
		out.close();
	}

	public static int binaryOddonaccif(int x) {

		int OddonacciValue;
		// Increase the number of calls each time the method is called (executes)
		numberOfCalls++;
		currentStackSize++; // Increment this counter as indication/simulation of
							// a push() operation on the stack for the current call
		if (currentStackSize > maxReachedStackSize) // Keep track of maximum reached stack growth
			maxReachedStackSize = currentStackSize;
		out.println("\nCurrently calculating Fibonacci value for x=" + x + ".");
		System.out.println("\nCurrently calculating Fibonacci value for x=" + x + ".");
		out.println(" ==> The current stack size is: " + currentStackSize + ".");
		System.out.println(" ==> The current stack size is: " + currentStackSize + ".");

		if (x == 1 || x == 2 || x == 3) {
			OddonacciValue = 1;
		}

		else {
			OddonacciValue = binaryOddonaccif(x - 1) + binaryOddonaccif(x - 2) + binaryOddonaccif(x - 3);
		}

		currentStackSize--;// Decrement before popping
		out.println("Just finished with the calculation of Oddonacci value: " + x + ".");
		System.out.println("Just finished with the calculation of Oddonacci value: " + x + ".");
		out.println(" <== The current stack size is: " + currentStackSize + ".");
		System.out.println(" <== The current stack size is: " + currentStackSize + ".");
		return OddonacciValue;
	}

}
