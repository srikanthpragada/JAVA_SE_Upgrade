package collections;

import java.util.List;

public class ListOfDemo {

	public static void main(String[] args) {
		// Immutable Empty List
		List<String> list1 = List.of();
		List<String> list2 = List.of("one", "two", "three");

		for (String s : list2)
			System.out.println(s);
	}
}