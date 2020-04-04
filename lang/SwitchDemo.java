package lang;

public class SwitchDemo {

	public static void main(String[] args) {
		int code = 3;

		switch (code) {
	       case 1 -> System.out.println(10);
		   case 2, 3 -> System.out.println(20); 
		   default -> System.out.println(5);
		}
	}
}
