package streams;

import java.util.Map;
import java.util.stream.Stream;

public class OfNullableDemo {

	public static void main(String[] args) {
		Map<String, String> phones = Map.ofEntries(Map.entry("Abc", "8989898988"), Map.entry("Pqr", "8989898988"));

		Stream.of("Abc", "Xyz", "Pqr")
		   .flatMap(name -> {
			  String phone = phones.get(name);
		  	  return phone == null ? Stream.empty() : Stream.of(phone);
		}).forEach(System.out::println);
		
		// Using  Stream.ofNullable() 

		Stream.of("Abc", "Xyz", "Pqr").flatMap(name -> Stream.ofNullable(phones.get(name)))
				.forEach(System.out::println);

		// Stream<Integer> s1 = Stream.ofNullable(null);
		// System.out.println(s1.count());
		// // System.out.println(s1.iterator().next());
		//
		// Stream<Integer> s2 = Stream.ofNullable(100);
		// System.out.println(s2.iterator().next());

	}

}
