import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class NewTryWithResource {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		
		// s is effectively final 
		try (s) {
			String line = s.nextLine();
		}

		BufferedReader br = new BufferedReader(new FileReader("names.txt"));
		System.out.println(readLineAndClose(br));
	}

	public static String readLineAndClose(BufferedReader br) {
		try (br) {
			return br.readLine();
		} catch (Exception ex) {
			return null;
		}
	}

}
