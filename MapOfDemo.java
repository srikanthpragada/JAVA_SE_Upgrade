package collection;

import java.util.Map;

public class MapOfDemo {

	public static void main(String[] args) {
		Map<Integer, String> maps = Map.of(1, "One", 2, "Two");

		Map<Integer, String> maps2 = Map.ofEntries(Map.entry(1, "One"), Map.entry(2, "Two"));

		for (Integer k : maps.keySet())
			System.out.println(k + ": " + maps.get(k));

		for (Integer k : maps2.keySet())
			System.out.println(k + ": " + maps2.get(k));

	}

}
