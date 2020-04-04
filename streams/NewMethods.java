package streams;

import java.util.stream.Stream;

public class NewMethods {

	public static void main(String[] args) {
		Stream<Integer> nums = Stream.of(10, 22, 31, 34, 87, 12);
		Stream<Integer> evenNums = nums.takeWhile(n -> n % 2 == 0);
		evenNums.forEach(System.out::println);
		
		Stream<Integer> nums2 = Stream.of(10,22,31,34,87,12);
		nums2.dropWhile(n -> n % 2 == 0).forEach(System.out::println);
		
		Stream<Integer> oddNums = Stream.iterate(1,v->v < 10,v->v + 2);
  	    oddNums.forEach(System.out::println);
	}
}
