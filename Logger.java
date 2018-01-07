
public interface Logger {
	
	 private void log(String message, String target) {
		 // log message to target 
	 }
	 
	 default void logToFile(String message) {
		 log(message, "file");
	 }
	  
	 default void logToDatabase(String message) {
		 log(message, "database");
	 }
	  
	 
}
