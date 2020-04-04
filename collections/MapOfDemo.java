package collections;

import java.util.Map;

public class MapOfDemo {

	public static void main(String[] args) {
		// Immutable Empty Map
		Map<String, String> emptyMap = Map.of();

		// Immutable Map
		Map<String, String> phones = Map.of("Bill", "39393393988", "Larry", "9988776655");

		// Immutable Map
		Map<Integer, String> map = Map.ofEntries(Map.entry(1, "One"), Map.entry(2, "Two"));
	}
}
