package collection;

import java.util.Set;

public class SetOfDemo {
	public static void main(String args[]) {

		Set<String> names = Set.of("Bill", "Larry", "Steve");

		for (String n : names)
			System.out.println(n);

		

	}

}
