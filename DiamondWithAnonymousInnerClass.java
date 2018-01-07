import java.util.Arrays;
import java.util.Comparator;

public class DiamondWithAnonymousInnerClass {

	public static void main(String[] args) {

		String names[] = { "Steve", "Ted", "Larry", "Michell", "Richardson" };

		// We can use <> with anonymous inner class in Java 9
		Comparator<String> lengthCompare = new Comparator<>() {

			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}

		};

		Arrays.sort(names);

		for (String n : names)
			System.out.println(n);

		Arrays.sort(names, lengthCompare);

		for (String n : names)
			System.out.println(n);

	}

}
