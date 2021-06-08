
//Done by: Houssen Kassir 40015126
//For Course : comp 352
//Assignment #1
//------------------------------------------------------------------------------------------------------------------
import java.io.*;

public class linearOddonacci {
	private static PrintWriter out;// announcing the printer

	public static void main(String[] args) throws FileNotFoundException {// main method

		out = new PrintWriter(new FileOutputStream("Linear_Oddonacci_output.txt"));// directing output to an outside
																					// text file
		out.println("//Done by: Houssen Kassir 40015126\r\n" + "//For Course : comp 352\r\n" + "//Assignment #1\r\n"
				+ "//------------------------------------------------------------------------------------------------------------------");
		out.println(" ");
		for (int i = 5; i <= 100; i = i + 5) {// for loop to iterate between the values of 5 and 100 by increments of 5
			out.println("Here is the Oddonacci sequence of (" + i + "): ");
			System.out.println("Here is the Oddonacci sequence of (" + i + "): ");// prints to console
			Long start = System.currentTimeMillis();// start calculating time
			linearOddonaccif(i);// calling the Linear Oddonacci function

			Long end = System.currentTimeMillis();// end calculating time
			out.println(" ");
			out.println("\n\nThe Execution Time is (" + (end - start) + ") ms.");
			System.out.println("\n\nThe Execution Time is (" + (end - start) + ") ms.");// gets the actual time by
																						// finding the difference of
																						// start and end
			out.println("The method has been called (" + numberOfCalls + ") times.");
			System.out.println("The method has been called (" + numberOfCalls + ") times.");// return the number of
																							// times the function has
																							// been called
			out.println("\n");
			System.out.println("\n");
		}
		out.close();// close printer
	}

	private static int numberOfCalls = 0;

	public static int[] linearOddonaccif(int x) {

		numberOfCalls++;// Incrementing the number of calls each time the method runs

		int[] A = new int[3]; // create new array of size 3
		int i = 0, j = 0, m = 0;// create variables and initialize them to zero

		if (x == 1) { // checking for value of x=1
			i = x;
			j = 0;
			m = 1;

			A[0] = i;// set array indices as above mentioned by variables
			A[1] = j;
			A[2] = m;
			out.print(i + " " + j + " " + m);
			System.out.print(i + " " + j + " " + m);

			return (A);
		} else if (x == 2) {// checking for value of x=2
			i = 0;
			j = 1;
			m = x;

			A[0] = i;// set array indices as above mentioned by variables
			A[1] = j;
			A[2] = m;
			out.print(i + " " + j + " " + m);
			System.out.print(i + " " + j + " " + m);

			return (A);
		} else if (x == 3) {// checking for value of x=3
			i = 1;
			j = 1;
			m = 1;

			A[0] = i;// set array indices as above mentioned by variables
			A[1] = j;
			A[2] = m;
			out.print(i + " " + j + " " + m + " ");
			System.out.print(i + " " + j + " " + m + " ");
			return (A);
		} else {// all values of x higher than 3

			A = linearOddonaccif(x - 1); // recursive call of the function linearOddonacci
			i = A[0];
			j = A[1];
			m = A[2];
			out.print((i + j + m) + " ");
			System.out.print((i + j + m) + " ");
			A[0] = j;// set array indices as above mentioned by variables
			A[1] = m;
			A[2] = i + j + m;
			return (A);
		}
	}

}