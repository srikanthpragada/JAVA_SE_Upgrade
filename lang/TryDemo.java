package lang;

import java.util.Scanner;

public class TryDemo {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		// Variable s can be used with try with resource
		// even through it was created earlier.

		try (s) {
			System.out.println("Enter name :");
			String line = s.nextLine();
		}
	}
}
