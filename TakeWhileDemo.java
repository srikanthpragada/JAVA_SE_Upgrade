package streams;

import java.util.stream.Stream;

public class TakeWhileDemo {

	public static void main(String[] args) {
		Stream<Integer> nums = Stream.of(5, 10, 31, 34, 87, 92);

		Stream<Integer> evenNums = nums.takeWhile(n -> n < 50);

		evenNums.forEach(System.out::println);

	}

}
