package string;

public class NewMethods {

	public static void main(String[] args) {
		String st = "Hello!";
		System.out.println(st.repeat(5));
		System.out.println("  ".isBlank());
		System.out.println(" Java 14  ".strip());

		String wish = "Hello!\nHow are you?";
		wish.lines().forEach(System.out::println);

		System.out.println("Hello".indent(10));

		"First\nSecond\nThird".indent(5).lines().forEach(System.out::println);

		var name = "Srikanth".transform(String::toUpperCase).transform(s -> s.substring(0, 5));
		System.out.println(name);
	}
}
