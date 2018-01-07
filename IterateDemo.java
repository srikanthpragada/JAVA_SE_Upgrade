package streams;

import java.util.stream.Stream;

public class IterateDemo {

	public static void main(String[] args) {

	       Stream<Integer> oddNums = Stream.iterate(1, v -> v < 10, v -> v + 2);
	       oddNums.forEach(System.out::println);

	}

}
