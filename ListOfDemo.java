package collection;

import java.util.Arrays;
import java.util.List;

public class ListOfDemo {

	public static void main(String[] args) {
		
		String names[] = { "First", "Second", "Third" };

		List<String> list1 = Arrays.asList(names);
		// list1.add("Abc");  // Throws exception
		
		list1.set(0, "New First"); // Possible so List is not immutable 
		
		

		List<Integer> nums = List.of(1, 2, 3); // Returns immutable collection - ImmutableCollections$ListN
		System.out.println(nums.getClass());

		for (int n : nums)
			System.out.println(n);
		
		// Both throw exception
		// nums.add(4);     
		// nums.set(0, 11);
	}

}
