package dates;

import java.time.LocalDate;

public class NewMethods {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2020, 4, 1);
		start.datesUntil(LocalDate.now())	
		     .forEach(System.out::println);
	}
}
