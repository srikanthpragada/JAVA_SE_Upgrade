import java.nio.charset.Charset;
import java.util.SortedMap;

public class CompactStringDemo {

	public static void main(String[] args) {
		 String s = new String("Srikanth");
		 
		 System.out.println(Charset.defaultCharset().name());
		 
//		 SortedMap<String,Charset> charsets = Charset.availableCharsets();
//		 
//		 for(String name : charsets.keySet())
//			 System.out.println(name +  " : " + charsets.get(name).displayName());
	 
	}

}
