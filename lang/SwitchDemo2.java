package lang;

public class SwitchDemo2 {

	public static void main(String[] args) {
		int code = 2;
		
		int disrate = switch (code) {
		case 1:
			yield 10;
		case 2, 3:
			yield 20;
		default:
			yield 5;
		};

		System.out.println(disrate);
	}

}
