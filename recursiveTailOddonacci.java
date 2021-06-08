
//Done by: Houssen Kassir 40015126
//For Course : comp 352
//Assignment #1
//------------------------------------------------------------------------------------------------------------------
import java.io.*;

// Tail Recursive for Oddonacci Implementation

class recursiveTailOddonacci {
	private static PrintWriter out;// announcing the printer

	public static void main(String[] args) throws FileNotFoundException {

		out = new PrintWriter(new FileOutputStream("Tail_Recursive_Oddonacci_output.txt"));// output file
		out.println("//Done by: Houssen Kassir 40015126\r\n" + "//For Course : comp 352\r\n" + "//Assignment #1\r\n"
				+ "//------------------------------------------------------------------------------------------------------------------");
		out.println(" ");

		for (int i = 5; i <= 100; i = i + 5) { // increments of 5 from 5 to 100
			out.println("Printing Oddonacci results for: " + i);
			System.out.println("Printing Oddonacci results for: " + i);
			Long start = System.currentTimeMillis(); // start of calculating time

			out.println("Oddonacci(" + i + ") = " + tailOddonacci(i, 1, 1, 1));
			System.out.println("Oddonacci(" + i + ") = " + tailOddonacci(i, 1, 1, 1));
			Long end = System.currentTimeMillis(); // end of calculating time
			out.println(" ");
			System.out.println(" ");
			out.println("Execution time is (" + (end - start) + ") ms.");
			System.out.println("Execution time is (" + (end - start) + ") ms.");
			out.println("The method has been called (" + numberOfCalls + ") times.");
			System.out.println("The method has been called (" + numberOfCalls + ") times.");
			out.println(" ");
			System.out.println(" ");
		}
		out.close();
	}

	// A tail recursive function to calculate n the Oddonacci number
	private static int numberOfCalls = 0;

	static int tailOddonacci(int n, int a, int b, int c) { // recursive function
		numberOfCalls++;
		if (n == 1)
			return a;
		if (n == 2)
			return b;
		if (n == 3)
			return c;
		return tailOddonacci(n - 1, b, c, a + b + c);// recursive call
	}

}