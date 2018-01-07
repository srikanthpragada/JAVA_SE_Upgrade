package dates;

import java.time.LocalDate;
import java.time.Period;

public class DatesUntilDemo {

	public static void main(String[] args) {
		 
	     // On which day  the Anniversary  of ST fell since its inception
		
		LocalDate dob = LocalDate.of(1998, 10, 24);
		dob.datesUntil( LocalDate.now(), Period.ofYears(1))
		   .forEach(  d ->  System.out.printf("In %d  it was %s\n", d.getYear(), d.getDayOfWeek().name()));
		
		
		// Print all dates from 1-10-2017 to 31-12-2017
		
//		LocalDate start = LocalDate.of(2017, 10, 1);
//		start.datesUntil(LocalDate.of(2018,1,1)).forEach(System.out::println);
		

	}

}
