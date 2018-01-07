package optional;

import java.time.LocalDate;
import java.util.Optional;

public class AddedMethod {

	public static void main(String[] args) {
		 
		Optional<String> es = Optional.empty();
		
		System.out.println(es);
		
		Optional<String> s =  Optional.of("Abc");
		
		System.out.println(s);
		
	    s.ifPresent(System.out::println);
	    System.out.println( s.orElse("Nothing"));
	    System.out.println( es.orElse("Nothing"));
		
	    es.ifPresentOrElse(System.out::println, () -> System.out.println("Nothing is present"));
	    
	    System.out.println( "Value of es : " + es.or(() -> Optional.of("Empty")).get());
	    System.out.println( "Value of s  : " + s.or(() -> Optional.of("Empty")).get());
		
		
	    Optional<LocalDate> startDate = Optional.of(LocalDate.now().minusDays(10));
	    Optional<LocalDate> endDate = Optional.empty();
	    
	    startDate.ifPresent( System.out::println);
	    System.out.println( endDate.isPresent() ? endDate.get() :  "Not available");
	    
	    startDate.ifPresentOrElse( System.out::println, () -> System.out.println("Missing start date"));
	    endDate.ifPresentOrElse( System.out::println, () -> System.out.println("Missing end date"));
	    
	    System.out.println();
	    
	    Optional<LocalDate> finalDate = endDate.or(() -> Optional.of(LocalDate.now()));
	    
	    System.out.println(finalDate.get());
 
	}

}
