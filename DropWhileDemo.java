package streams;

import java.util.List;

public class DropWhileDemo {

	public static void main(String[] args) {
		List<Integer> nums = List.of(10, 22, 31, 34, 87, 92);

		// Old way in 8
		nums.stream().filter(n -> n >= 50).forEach(System.out::println);

		// New way in 9
		nums.stream().dropWhile(n -> n < 50).forEach(System.out::println);
	}

}
